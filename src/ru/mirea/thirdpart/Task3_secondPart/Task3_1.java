package ru.mirea.thirdpart;

import java.util.Scanner;
import java.util.Random;

public class Task3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Размер массива = ");
        int arrSize = in.nextInt();
        double[] mainArr = new double[arrSize];
        for (int i = 0; i < arrSize; i++) {
            mainArr[i] = randomDouble();
        }

        System.out.print("Массив до сортировки: ");
        printArr(mainArr);

        DoSort exmp = new DoSort();
        exmp.bubbleSort(mainArr);

        System.out.print("Массив после сортировки: ");
        exmp.printArrSorted(mainArr);

    }

    public static void printArr(double[] currArr) {
        for (int i = 0; i < currArr.length - 1; i++) {
            System.out.printf("%.3f", currArr[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static double randomDouble() {
        Random rand = new Random();
        return rand.nextDouble();
    }

}

class DoSort {

    public static void bubbleSort(double[] currArr) {
        for (int i = 0; i < currArr.length - 1; i++) {
            for (int j = 0; j < currArr.length - i - 1; j++) {
                if (currArr[j] > currArr[j + 1]) {
                    double tmp = currArr[j];
                    currArr[j] = currArr[j + 1];
                    currArr[j + 1] = tmp;
                }
            }
        }
    }

    public static void printArrSorted(double[] currArr) {
        for (int i = 0; i < currArr.length - 1; i++) {
            System.out.printf("%.3f", currArr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

}
