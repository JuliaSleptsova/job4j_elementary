package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0() {
        Fact.calc(-2);
    }

    @Test
    public void whenN10Than() {
        int rsl = Fact.calc(10);
        assertThat(rsl, is(3628800));
    }

    @Test
    public void whenN3Than6() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
}