package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rsl += array[row][cell];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Сумма всех элементов равна: "
                + sum(new int[][]{{1, 1, 1}, {2, 2}, {3, 3, 3, 3}}));
    }
}
