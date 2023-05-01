package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {5, 1, 4, 8}, 1, 3));
    }
}
