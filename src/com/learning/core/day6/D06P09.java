package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

public class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Car other) {
        return name.compareTo(other.name); 
    }
}

public class D06P09 {
    public static void main(String[] args) {
    	
    	TreeMap<String, Car> carMap = new TreeMap<>();

        carMap.put("Swift", new Car("Swift", 500000.0));
        carMap.put("Innova", new Car("Innova", 1200000.0));
        carMap.put("Creta", new Car("Creta", 850000.0));
        carMap.put("Reva", new Car("Reva", 80000.0));

        double newPrice = 80050.0;

        if (carMap.containsKey("Reva")) {
            Car updatedCar = new Car("Reva", newPrice);
            carMap.put("Reva", updatedCar); 
            System.out.println("Reva " + newPrice);
        } else {
            System.out.println("Key \"Reva\" not found.");
        }
    }
}
