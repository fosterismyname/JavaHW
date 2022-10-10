package ru.mirea.firstpart;

import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {

    public static void Task1_3() {

        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int arrSize = in.nextInt();
        int[] mainArr = new int[arrSize];
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
        Task1_6();
    }

    public static void Task1_4() {
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
        System.out.print("Сумма = ");
        System.out.println(amount);
        System.out.print("Минимальный элемент = ");
        System.out.println(minimum);
        System.out.print("Максимальный элемент = ");
        System.out.println(maximum);
    }

    public static void Task1_5(String[] args) {
        int tmp = args.length;
        for (int i = 0; i < tmp; i++) {
            System.out.print(args[i]);
        }
    }

    public static void Task1_6() {
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

    public static void Task1_7() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number + "! = " + factorial(number));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task1_3();
        Task1_4();
        Task1_5(in.nextLine().split(" "));
        Task1_6();
        Task1_7();
    }
}
 
