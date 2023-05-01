package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println("Индек элемента равен " + indexOf(new int[]{10, 3, 5}, 5));
        System.out.println();
        System.out.println("Индек элемента в диапазоне равен "
                + indexInRange(new int[]{10, 9, 3, 8, 6, 5}, 8, 1, 3));
    }
}