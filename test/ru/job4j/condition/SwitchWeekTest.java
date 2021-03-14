package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenDayIs1() {
        int in = 1;
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDayIs8() {
        int in = 8;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, out);
    }
}