package org.example;

public class Premium implements FareStrategy{
    private double dollar;
    public double calculateFare(double kilometer,double minutes){
        this.dollar = (kilometer * 1.25)+(minutes * 0.5);
        return dollar;
    }
}
