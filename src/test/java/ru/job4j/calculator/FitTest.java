package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    void whenManHeightIs187ThenCorrectWeight() {
        int height = 187;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(100.05, withPrecision(0.01));
    }

    @Test
    void whenWomanHeightIs165ThenCorrectWeight() {
        int height = 165;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(63.25, withPrecision(0.01));
    }

    @Test
    void whenManHeightIsLessThan50ThenExceptionThrown() {
        int height = 40;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than 50 cm");
    }

    @Test
    void whenWomanHeightIs200ThenCorrectWeight() {
        int height = 200;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(103.50, withPrecision(0.01));
    }
}
