package design.patterns.behavioral.observer.headfirst.nonjdk;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public class WeatherServiceDemo {

    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        Observer observer = new CurrentConditionsDisplay(weatherData);

        ((WeatherData)weatherData).setMeasurments(10, 20,30);
    }
}
