package design.patterns.behavioral.observer.headfirst.nonjdk;

import java.util.ArrayList;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;
    private boolean isChanged;


    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {

        int i = observers.indexOf(o);

        if(i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void setChanged() {
        this.isChanged = true;
    }

    @Override
    public void notifyObservers() {
        if(!isChanged) return;
        for(Observer o : observers){
            o.update(this,null);
        }
    }


    public void measurementsCHanged(){
        setChanged();
        notifyObservers();
    }


    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsCHanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
