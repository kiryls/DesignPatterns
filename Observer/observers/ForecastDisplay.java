package Observer.observers;

import Observer.interfaces.*;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");

        if(currentPressure > lastPressure) 
            System.out.println("improving weather on the way!");

        else if(currentPressure == lastPressure)
            System.out.println("more of the same");

        else
            System.out.println("watch out for cooler, rainy weather");
    }
}