package ru.mirea.firstpart;

import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {

    public static void task1_3() {

        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int arrSize = in.nextInt();
        int mainArr[] = new int[arrSize];
        int amount = 0;
        System.out.print("Введите массив с клавиатуры: ");

        for (int i = 0; i < arrSize; i++) {
            mainArr[i] = in.nextInt();
            amount = amount + mainArr[i];
        }

        System.out.println("Сумма = ");
        System.out.print(amount);
        System.out.println("Среднее арифметическое = ");
        System.out.print((float)(amount / arrSize));
    }

    public static void task1_4() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mainList = new ArrayList<>();
        int size = 0, amount = 0, index = 0;
        int minimum = 0, maximum = 0;
        System.out.print("Чтобы остановить ввод, введите «0». Введите массив с клавиатуры: ");

        do {
            mainList.add(in.nextInt());
            ++index;

        } while (mainList.get(index - 1) != 0);

        while (size < index - 1) {
            amount = amount + mainList.get(size);
            if (mainList.get(size) > maximum) maximum = mainList.get(size);
            if (mainList.get(size) < minimum) minimum = mainList.get(size);
            size = size + 1;
        }
        System.out.println("Сумма = " + amount);
        System.out.println("Минимальный элемент = " + minimum);
        System.out.println("Максимальный элемент = " + maximum);
    }

    public static void task1_5(String[] args) {
        int tmp = args.length;
        for (int i = 0; i < tmp; i++) {
            System.out.print(args[i]);
        }
    }

    public static void task1_6() {
        String resultStr = "";
        for (int i = 1; i < 11; i++) {
            resultStr = resultStr + String.format("%.4f", 1.0 / i);
        }
        System.out.println(resultStr);
    }

    public static long factorial(int number) {
        long resultFact = 1;
        for (long i = 1; i < number + 1; i++) {
            resultFact = resultFact * i;
        }
        return resultFact;
    }

    public static void task1_7() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number + "! = " + factorial(number));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        task1_3();
        task1_4();
        task1_5(in.nextLine().split(" "));
        task1_6();
        task1_7();
    }
}
