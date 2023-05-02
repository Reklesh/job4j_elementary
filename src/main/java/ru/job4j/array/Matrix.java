package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] rst = multiple(4);
        for (int row = 0; row < rst.length; row++) {
            for (int cell = 0; cell < rst[row].length; cell++) {
                System.out.println(rst[row][cell]);
            }

        }
    }
}
