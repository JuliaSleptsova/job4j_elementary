package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenDayRu1() {
        String in = "Понедельник";
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDayEn1() {
        String in = "Monday";
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDayDefault() {
        String in = "Monday1";
        int expected = -1;
        int out = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, out);
    }
}