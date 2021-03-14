package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x2 - x1 == y2 - y1 || x1 - x2 == y2 - y1 || x2 - x1 == y1 - y2 || x1 - x2 == y1 - y2) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

}
