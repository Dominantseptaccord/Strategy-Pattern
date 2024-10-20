package org.example;

public class Discount implements FareStrategy{
    private double dollar;
    public double calculateFare(double kilometer,double minutes){
        this.dollar = (kilometer * 0.75)+(minutes * 0.15);
        return dollar;
    }
}
