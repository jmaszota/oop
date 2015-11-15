package design.patterns.structural.proxy.headfirst.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by jacek.maszota on 11.09.2015.
 */
public class DynamicProxyTestDrive {
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl();
         joe.setName("Joe");

        PersonBean ownerProxy = getOwnerProxy(joe);

        System.out.println("Name:" + ownerProxy.getName());

        ownerProxy.setGender("Male");

        try{
            ownerProxy.setHotOrNotRating(5);
        }catch (Exception e){
            System.out.println("You can't rate your self");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);

        nonOwnerProxy.setHotOrNotRating(5);

        try{
        nonOwnerProxy.setName("Joe2");
        }catch (Exception e){
            System.out.println("You can't rate your self");
        }

        System.out.println("Get HotOrNot: " + joe.getHotOrNotRating());
    }

    public static PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    public static PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }
}
