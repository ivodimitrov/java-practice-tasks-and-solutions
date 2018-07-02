package javaabeginnersguide;

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelCapacity = 16;
        minivan.fuelConsumption = 21;

        range = minivan.fuelCapacity * minivan.fuelConsumption;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range);
    }
}
