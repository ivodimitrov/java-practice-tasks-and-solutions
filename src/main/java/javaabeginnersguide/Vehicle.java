package javaabeginnersguide;

class Vehicle {

    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

