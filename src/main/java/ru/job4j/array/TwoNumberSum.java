package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int[] rst = new int[0];
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                rst = new int[]{i, j};
                break;
            }
            if (array[j] == array[array.length - 1]) {
                i++;
                j = i;
            }
            j++;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = getIndexes(new int[] {3, 4, 6, 8, 10}, 10);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
