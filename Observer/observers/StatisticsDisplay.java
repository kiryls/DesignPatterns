package Observer.observers;

import Observer.interfaces.*;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if(temperature > maxTemp) 
            maxTemp = temperature;

        if(temperature < minTemp)
            minTemp = temperature;

        display();
    }

    public void display() {
        System.out.println("STATS: Avg: " + (tempSum / numReadings) + ", Max: " + maxTemp + ", Min: " + minTemp);
    }
}