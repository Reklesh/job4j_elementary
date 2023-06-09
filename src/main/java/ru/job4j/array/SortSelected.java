package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] lsr = sort(new int[]{2, 3, 4, 1, 6, 5});
        for (int index = 0; index < lsr.length; index++) {
            System.out.println(lsr[index]);
        }
    }
}
