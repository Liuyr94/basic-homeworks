package com.bessonov.homework3;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1111);
            }
        }
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(sumElementsSecondRowTwoDimensionalArray(array));
        System.out.println(findMax(array));
        zeroingDiagonals(array);
    }

    public static int sumOfPositiveElements(int[][] array) {
        int result = 0;
        for (int[] ints : array) {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > 0) {
                    result += ints[i];
                }
            }
        }
        return result;
    }

    public static void printSquareStar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void zeroingDiagonals(int[][] array) {
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            array[i][j] = 0;
        }
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array[i][j] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumElementsSecondRowTwoDimensionalArray(int[][] array) {
        int result = -1;
        if (array.length >= 1) {
            result = 0;
            for (int i = 0; i < array[1].length; i++) {
                result += array[1][i];
            }
        }
        return result;
    }

    public boolean isPalindrome(int x) {
        boolean result = true;
        String number = String.valueOf(x);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
