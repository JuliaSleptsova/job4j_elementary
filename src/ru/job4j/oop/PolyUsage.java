package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{train, plane, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
