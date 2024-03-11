package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

 class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", name, price);
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

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<String, Car> carMap = new TreeMap<>();

        carMap.put("Swift", new Car("Swift", 305000.0));
        carMap.put("Audi", new Car("Audi", 600100.0));
        carMap.put("Benz", new Car("Benz", 900000.0));
        carMap.put("Bugatti", new Car("Bugatti", 80050.0));

        Car removedCar = carMap.remove(carMap.lastKey());

        for (Car car : carMap.values()) {
            System.out.println(car);
        }
    }
}