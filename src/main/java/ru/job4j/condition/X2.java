package ru.job4j.condition;

public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        System.out.println(calc(1, 1, 1, 1));
        System.out.println(calc(0, 1, 1, 1));
        System.out.println(calc(1, 1, 0, 1));
        System.out.println(calc(1, 1, 1, 0));
    }
}
