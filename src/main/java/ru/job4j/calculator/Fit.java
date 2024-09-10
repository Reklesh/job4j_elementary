package ru.job4j.calculator;

public class Fit {

    public static double calculateWeight(int height, int base) {
        if (height < 50) {
            throw new IllegalArgumentException("Height must be greater than 50 cm");
        }
        return Math.round((height - base) * 1.15 * 100.0) / 100.0;
    }

    public static double manWeight(int height) {
        return calculateWeight(height, 100);
    }

    public static double womanWeight(int height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        int height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.printf("Man 187 is %.2f%n", man);
        System.out.printf("Woman 187 is %.2f%n", woman);
    }
}

