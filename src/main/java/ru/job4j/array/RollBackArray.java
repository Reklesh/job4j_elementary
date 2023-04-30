package ru.job4j.array;

public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] rls = rollback(new int[]{1, 2, 3, 4, 5});
        for (int index = 0; index < rls.length; index++) {
            System.out.println(rls[index]);
        }
    }
}