package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index <= (number - 1); index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println("1 - это простое число: " + check(1));
        System.out.println("7 - это простое число: " + check(7));
    }
}
