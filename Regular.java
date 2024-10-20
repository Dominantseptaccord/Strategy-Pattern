package org.example;

public class Regular implements FareStrategy{
    private double dollar;
    public double calculateFare(double kilometer,double minutes){
        this.dollar = (kilometer * 1)+(minutes * 0.25);
        return dollar;
    }
}
