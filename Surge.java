package org.example;

public class Surge implements FareStrategy{
    private double dollar;
    public double calculateFare(double kilometer,double minutes){
        this.dollar = (kilometer * 2)+(minutes * 0.75);
        return dollar;
    }
}
