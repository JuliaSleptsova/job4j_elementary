package ru.job4j.poly;

public class Bus implements Transport{

    private int cost = 40;

    @Override
    public void go() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров равно " + number);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * cost;
    }
}
