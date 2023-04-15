package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(multiply(1, 2));
        System.out.println(minus(1, 2));
        System.out.println(division(1, 2));
    }
}