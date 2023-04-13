package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(106, 3, 78, 37);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result2 (106, 3) to (78, 37) " + result2);
    }
}
