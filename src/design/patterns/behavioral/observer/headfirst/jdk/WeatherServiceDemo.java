package design.patterns.behavioral.observer.headfirst.jdk;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public class WeatherServiceDemo {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);

        wd.setMeasurements(20,15,10);

    }
}
