package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String in = Integer.toString(i);
        boolean rsl = true;
        for (int j = 0; j < in.length() / 2; j++) {
            if (in.charAt(j) != in.charAt(in.length() - j - 1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
