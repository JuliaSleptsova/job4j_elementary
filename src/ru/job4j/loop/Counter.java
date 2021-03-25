package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumByEvenMy(int start, int finish) {
        int sum = 0;
        if (start % 2 != 0) {
            start++;
        }
        for (int i = start; i <= finish; i += 2) {
            sum = sum + i;
        }
        return sum;
    }
}
