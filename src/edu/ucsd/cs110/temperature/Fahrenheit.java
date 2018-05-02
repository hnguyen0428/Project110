package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.temperature.Celsius;

/**
 * Created by hnguyen0428 on 5/2/18.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((this.getValue() - 32.0) / 1.8));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return "" + this.getValue() + " F";
    }
}
