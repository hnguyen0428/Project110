package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.temperature.Fahrenheit;

/**
 * Created by hnguyen0428 on 5/2/18.
 */
public class Celsius extends Temperature {
    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        return "" + this.getValue() + " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit((float)(this.getValue() * 1.8 + 32));
    }
}
