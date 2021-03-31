package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6() {
        int first = 1;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8() {
        int first = 8;
        int second = 5;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax16() {
        int first = 8;
        int second = 5;
        int third = 6;
        int fourth = 16;
        int result = Max.max(first, second, third, fourth);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax51() {
        int first = 8;
        int second = 51;
        int third = 6;
        int fourth = 16;
        int result = Max.max(first, second, third, fourth);
        int expected = 51;
        Assert.assertEquals(result, expected);
    }
}