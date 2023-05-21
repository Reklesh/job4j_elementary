package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 2;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void allEq() {
        int first = 2;
        int second = 2;
        int third = 2;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
