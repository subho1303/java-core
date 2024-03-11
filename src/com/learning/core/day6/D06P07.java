package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car> 
{
    private String name;
    private double price;

    public Car(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) 
    {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() 
    {
        return name + " " + price;
    }
}

public class D06P07 
{
    public static void main(String[] args) 
    {
        TreeMap<Car, String> carMap = new TreeMap<>();
        
        Car benz = new Car("Benz", 900000.0);
        Car bugatti = new Car("Bugatti", 80050.0);
        Car ferrari = new Car("Ferrari", 500000.0);
        Car tesla = new Car("Tesla", 850000.0);
        
        carMap.put(benz, "Luxury");
        carMap.put(bugatti, "Super");
        carMap.put(ferrari, "Sport");
        carMap.put(tesla, "Electric");

        System.out.println(carMap.lastEntry().getKey());

        System.out.println(carMap.firstEntry().getKey());

    }
}
