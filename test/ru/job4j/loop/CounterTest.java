package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenStart3Finish8Them33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenStart0Finish5Them15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenStart9Finish80Them3204() {
        int start = 9;
        int finish = 80;
        int expected = 3204;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}