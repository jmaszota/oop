package design.patterns.behavioral.observer.headfirst.nonjdk;

import design.patterns.behavioral.observer.headfirst.DisplayElement;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;


    public CurrentConditionsDisplay(Subject subject) {
        subject.register(this);
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Current conditions - temp: " + temperature + "F, humidity:" + humidity);
    }

    @Override
    public void update(Subject subject, Object arg) {
        if(subject instanceof WeatherData){
            this.humidity = ((WeatherData) subject).getHumidity();
            this.temperature = ((WeatherData) subject).getTemperature();
            display();
        }

    }
}
