package design.patterns.behavioral.observer;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class ObserverDemo {

    public static void main(String[] args) {

        NewsPublisher newsPublisher = new NewsPublisher();

        EmailSubscriber emailSubscriber = new EmailSubscriber();
        SMSSubscriber smsSubscriber = new SMSSubscriber();

        newsPublisher.attach(emailSubscriber);
        newsPublisher.attach(smsSubscriber);

        newsPublisher.publishLatestNews("You won 100 mln $!");

        newsPublisher.detach(emailSubscriber);

        newsPublisher.publishLatestNews("It was a joke.");

    }
}
