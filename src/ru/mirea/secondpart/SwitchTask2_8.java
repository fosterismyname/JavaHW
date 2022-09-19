package ru.mirea.secondpart;

import java.util.Scanner;

public class SwitchTask2_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество слов n = ");
        int value = in.nextInt();
        String[] mainArr = new String[value];
        System.out.print("Введите строку: ");

        //reading the String
        for (int i = 0; i < value; i++) {
            mainArr[i] = in.next();
        }

        //test output
        System.out.print("Начальная строка: ");
        printArr(mainArr, value);

        //switching elements
        String tmp;
        for (int i = 0; i < value / 2 ; i++) {
            tmp = mainArr[value - i - 1];
            mainArr[value - i - 1] = mainArr[i];
            mainArr[i] = tmp;
        }
        System.out.print("Строка после переворота: ");
        printArr(mainArr, value);
    }

    public static void printArr(String[] currArr, int sizeArr) {
        for (int i = 0; i < sizeArr; i++) {
            System.out.print(currArr[i] + " ");
        }
    }
}
