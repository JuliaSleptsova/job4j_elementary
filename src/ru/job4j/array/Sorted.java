package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        int min = array[0];
        boolean rst = true;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                rst = false;
                break;
            }
            min = array[i];
        }
        return rst;
    }
}
