package design.patterns.structural.proxy.headfirst.dynamicproxy;

/**
 * Created by jacek.maszota on 11.09.2015.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
