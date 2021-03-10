package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        int inDollar = 180;
        int expectedDollar = 3;
        int out = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == out;
        System.out.println("180 rubles are 3. Test result : " + passedDollar);

    }
}
