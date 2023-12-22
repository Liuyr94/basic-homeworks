package com.bessonov.homework2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MainApplication {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 5);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        sumDiagonalArray(array);
        multiplyArrayElementByNumber(array, 12);
        String[] arr = {"w", "d", "b", "c"};
        sortArray(arr);
        String abc = "avb";
    }

    public static void printMessage(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println("Печатаем сообщения " + message + " количество раз = " + count);
        }
    }

    public static void sumArrayElementsThanFive(int[] array) {
        int result = 0;
        for (int numb : array) {
            if (numb > 5) {
                result += numb;
            }
        }
        System.out.println("Сумма всех элементов массива которые больше 5 = " + result);
    }

    public static void arraySpecifiedNumber(int[] array, int numb) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numb;
        }
        System.out.println("Заполнили массив " + Arrays.toString(array) + " числом numb");
    }

    public static void increaseArrayElement(int[] array, int numb) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * numb;
        }
        System.out.println("Каждое значение массива умножили на " + numb + " и получили массив " + Arrays.toString(array));
    }

    public static void compareHalvesArray(int[] array) {
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= array.length / 2) {
                firstHalf += array[i];
            } else {
                secondHalf += array[i];
            }
        }

        if (firstHalf > secondHalf) {
            System.out.println("Первая половина массива больше второй: \n1.Первая половина = " + firstHalf + "\n2" + ".Вторая половина = " + secondHalf);
        } else {
            System.out.println("Вторая половина массива больше второй: \n1.Первая половина = " + firstHalf + "\n2" + ".Вторая половина = " + secondHalf);
        }
    }

    public static void sumArray(int[]... array) {
        int longestArray = 0;
        for (int[] ints : array) {
            if (ints.length > longestArray) {
                longestArray = array.length;
            }
        }

        int[] result = new int[longestArray];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i] = array[i][j];
            }
        }

        System.out.println("Результирующий массив = " + Arrays.toString(result));
    }

    public static void pointArray(int[] array) {
        int firstSum = 0;
        int secondSum = 0;
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            firstSum += array[i];
            for (int j = i + 1; j < array.length; j++) {
                secondSum += array[j];
            }
            if (firstSum == secondSum) {
                result = i;
                break;
            } else {
                secondSum = 0;
            }
        }
        if (result != -1) {
            System.out.println("Точка остановы = " + result);
        } else {
            System.out.println("В данном массиве нету точки остановы");
        }
    }

    public static void arrayElementsDescendingAscending(int[] array, int choice) {
        int tmp = array[0];
        if (choice == 1) {
            for (int i = 1; i < array.length; i++) {
                if (tmp <= array[i]) {
                    tmp = array[i];
                } else {
                    System.out.println("Элементы в массиве не идут в порядке возрастания");
                    return;
                }
            }
            System.out.println("Элементы в массиве идут в порядке возрастания");
        } else {
            for (int i = 1; i < array.length; i++) {
                if (tmp >= array[i]) {
                    tmp = array[i];
                } else {
                    System.out.println("Элементы в массиве не идут в порядке");
                    return;
                }
            }
            System.out.println("Элементы в массиве идут в порядке убывания");
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println("Перевернутый массив " + Arrays.toString(array));
    }

    public static void createArrayRandom(int lengthArray) {
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println("Наш массив " + Arrays.toString(array));
    }

    public static void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов в массиве = " + sum);
    }

    public static void minMaxArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное значение массива = " + min + ". Максимальное значение в массиве = " + max);
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = array[i];
                if (array[i] > array[j]) {
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }

    public static void removedDuplicatesArray(int[] array) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            integers.add(array[i]);
        }
        System.out.println(integers);
    }

    public static void negativeElementArray(int[] array) {
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative += 1;
            }
        }
        System.out.println("Количество негативных элемнетов = " + negative);
    }

    public static void sumDiagonalArray(int[][] array) {
        int sumMain = 0;
        int sumSaid = 0;
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            sumMain += array[i][j];
        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            sumSaid += array[i][j];
        }

        System.out.println("Сумма основной диагонали = " + sumMain);
        System.out.println("Сумма побочной диагонали = " + sumSaid);
    }

    public static void multiplyArrayElementByNumber(int[][] array, int multiplication) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] *= multiplication;
            }

        }
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void sortArray(String[] array) {
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i].charAt(0);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                char tmp = arr[i];
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    array[i] = array[j];
                    array[j] = String.valueOf(tmp);
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
