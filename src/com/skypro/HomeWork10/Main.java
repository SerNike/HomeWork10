package com.skypro.HomeWork10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void test1() {
        int[] salaryArray = generateRandomArray();
        {
            System.out.println("задача 1");
            System.out.println(Arrays.toString(salaryArray));
            int salarySun = 0;
            for (int salary : salaryArray) {
                salarySun += salary;
            }
            System.out.println("Сумма трат за месяц составила " + salarySun + " рублей");
        }
    }

    public static void test2() {
        int[] salaryArray = generateRandomArray();
        {
            System.out.println("задача 2");
            System.out.println(Arrays.toString(salaryArray));
            int salaryMin = Integer.MAX_VALUE;
            int salaryMax = Integer.MIN_VALUE;
            for (int salary : salaryArray) {
                if (salary > salaryMax) {
                    salaryMax = salary;
                }
                if (salary < salaryMin) {
                    salaryMin = salary;
                }
            }
            System.out.println("Минимальная сумма трат за день составила "+ salaryMin +" рублей. Максимальная сумма трат за день составила "+ salaryMax +" рублей");

        }
    }
    public static void test3() {
        int[] salaryArray = generateRandomArray();
        {
            System.out.println("задача 3");
            System.out.println(Arrays.toString(salaryArray));
            int day = 30;
            int salarySun = 0;
            for (int salary : salaryArray) {
                salarySun += salary;
            }
            double salaryAverage = (double) salarySun / day;
            System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");
        }
    }
    public static void test4() {
        System.out.println("задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
