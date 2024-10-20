package org.example;

public class Main {
    public static void main(String[] args)  {
        System.out.println("What is the weather today? SUNNY? RAINY? SNOWSTORM?");
        RideContext rideContext = new RideContext(3,2,true,"RaInY");
        rideContext.setFareStrategy(new Regular());
        rideContext.executeFareStrategy();
        rideContext.setFareStrategy(new Discount());
        rideContext.executeFareStrategy();
        rideContext.setFareStrategy(new Premium());
        rideContext.executeFareStrategy();
        rideContext.setFareStrategy(new Surge());
        rideContext.executeFareStrategy();
    }
}
