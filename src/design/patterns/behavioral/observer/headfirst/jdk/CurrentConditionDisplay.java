package design.patterns.behavioral.observer.headfirst.jdk;

import design.patterns.behavioral.observer.headfirst.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable subject){
        observable = subject;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions - temp: " + temperature + "F, humidity:" + humidity);
    }
}
