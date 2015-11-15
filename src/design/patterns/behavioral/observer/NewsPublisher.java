package design.patterns.behavioral.observer;

import java.util.ArrayList;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class NewsPublisher {

    private ArrayList<Subscriber> subscribers;
    private String latestNews;

    public void attach(Subscriber subscriber){
        if(subscribers==null) subscribers = new ArrayList<>();
        subscribers.add(subscriber);
        numOfSubscribers();
    }

    public void detach(Subscriber subscriber){
        if(subscribers==null) return;
        subscribers.remove(subscriber);
        numOfSubscribers();
    }

    public void publishLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Subscriber sub : subscribers){
            sub.update(latestNews);
        }
    }


    public void numOfSubscribers()
    {
        System.out.println("Num of subs: " + (subscribers==null ? 0 : subscribers.size()));
    }
}
