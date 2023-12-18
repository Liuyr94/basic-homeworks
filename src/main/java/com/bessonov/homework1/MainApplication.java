package com.bessonov.homework1;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пожалуйста один из методов нашего приложения: \n1.Печатает в столбец 4 слова" +
                    ".\n2.Cчитает сумму трёх чисел и выводит результат в консоль определяя положительное это число или " +
                    "отрицательное.\n3.В зависимости от числа переменной определяет её цвет\n4.Сравнивает два числа и " +
                    "печатает в консоль результат\n5.В зависимости от инкремента печатает производит математическую " +
                    "операцию и печатает результат в консоль");
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    greetings();
                    break;
                case 2:
                    checkSign((int) (Math.random() * 1212), (int) (Math.random() * 1212), (int) (Math.random() * 1212));
                    break;
                case 3:
                    selectColor();
                    break;
                case 4:
                    compareNumbers();
                    break;
                case 5:
                    addOrSubtractAndPrint((int) (Math.random() * 1212), (int) (Math.random() * 1212),
                            Math.random() < 0.5);
                    break;
                default:
                    return;
            }
        }

    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 31);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data < 21) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 20);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
