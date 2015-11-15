package design.patterns.behavioral.observer;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class SMSSubscriber implements Subscriber{
    @Override
    public void update(String latestNews) {
        System.out.println("Got the news via SMS:" + latestNews);
    }
}
