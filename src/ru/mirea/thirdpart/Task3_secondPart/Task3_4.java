package ru.mirea.thirdpart;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int arrSize = in.nextInt();

        while (arrSize <= 0) {
            System.out.println("Некорректный размер массива!");
            System.out.println("Размер массива = ");
            arrSize = in.nextInt();

        }

        int[] mainArr = new int[arrSize];
        int counter = 0;
        Random rand = new Random();
        ArrayList<Integer> subArr = new ArrayList<>();

        for (int i = 0; i < mainArr.length; i++) {
            mainArr[i] = rand.nextInt((arrSize) + 1);
            if (mainArr[i] % 2 == 0) {
                subArr.add(mainArr[i]);
            }
        }
        System.out.println("Начальный (случайный) массив: ");
        printArr(mainArr);

        System.out.println("Подмассив, полученный из начального: ");
        printList(subArr);
    }

    public static void printArr(int[] currArr) {
        for (int i = 0; i < currArr.length; i++) {
            System.out.print(currArr[i] + " ");
        }
    }

    public static void printList(ArrayList<Integer> currList) {
        for (int i = 0; i < currList.size(); i++) {
            System.out.print(currList.get(i) + " ");
        }
    }
}
