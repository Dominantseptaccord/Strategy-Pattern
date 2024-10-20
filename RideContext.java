package org.example;

public class RideContext {
    private FareStrategy fareStrategy;
    private double kilometer;
    private double minutes;
    private boolean peakHours;
    private String weatherOf;
    private static final int SUNNY = 1;
    private static final int RAINY = 2;
    private static final int SNOWSTORM = 3;
    private static final double MINIMUM_FARE = 5.00;
    private static final double SHORT_DISTANCE_FARE = 2.0;
    public RideContext(double kilometer,double minutes, boolean peakHours, String weatherOf){
        // Invalid check;
        if (kilometer <= 0 || minutes <= 0) {
            System.out.println("Invalid: Kilometers or Minutes are Negative or Zero");
            return;
        }
        this.kilometer = kilometer;
        this.minutes = minutes;
        this.peakHours = peakHours;
        this.weatherOf = weatherOf;
    }
    public void setFareStrategy(FareStrategy fareStrategy){
        this.fareStrategy = fareStrategy;
    }
    public void executeFareStrategy() {
        // Logic execution;
        double fare = fareStrategy.calculateFare(kilometer, minutes);
        if (peakHours) {
            setFareStrategy(new Surge());
        }
        if (kilometer < SHORT_DISTANCE_FARE && fare < MINIMUM_FARE) {
            System.out.println("Minimum fare applied due to short distance.");
            fare = MINIMUM_FARE;
        }
        if(weatherOf.equalsIgnoreCase("SUNNY")){
            fare = fare * SUNNY;
        }
        else if(weatherOf.equalsIgnoreCase("RAINY")){
            fare = fare * RAINY;
        }
        else if(weatherOf.equalsIgnoreCase("SNOWSTORM")){
            fare = fare * SNOWSTORM;
        }
        System.out.println("You have to pay " + fare + "$");
    }
}
