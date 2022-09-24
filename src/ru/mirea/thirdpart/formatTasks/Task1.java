package ru.mirea.thirdpart.formatTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

class ConverterVal {

    private double firstVal = 0.0;
    private double secondVal = 0.0;
    private double thirdVal = 0.0;

    public ConverterVal(double firstVal, double secondVal, double thirdVal) {

        this.firstVal = firstVal;
        this.secondVal = secondVal;
        this.thirdVal = thirdVal;
    }

    public void setVal(double Val) {
        this.thirdVal = Val;
    }

    public void setFirstVal(int firstVal) {
        this.firstVal = firstVal;
    }

    public void setSecondVal(int secondVal) {
        this.secondVal = secondVal;
    }

    public double toUsd(double Val) {
        return (Val / firstVal);
    }

    public double toEuro(double Val) {
        return (Val / secondVal);
    }

    public double toRub(double Val) {
        return(Val / thirdVal);
    }

}

class MainTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную валюту: 1 - USD; 2 - EURO; 3 - RUB");
        System.out.print("Валюта = ");
        int currentVal = in.nextInt();
        ConverterVal currentConverter = new ConverterVal(20.58, 109.45, 167.89);

        while (currentVal > 3 || currentVal < 1) {
            System.out.println("Неверное значение!");
            System.out.print("Валюта = ");
            currentVal = in.nextInt();
        }
        System.out.print("Денежная сумма = ");
        int amountVal = in.nextInt();
        System.out.println("Выберите операцию: 1 - Конвертация в USD; 2 - Конвертация в EURO; 3 - Конвертация в RUB");
        System.out.print("Операция = ");
        int optVal = in.nextInt();

        while (optVal > 3 || optVal < 1) {
            System.out.println("Неверное значение!");
            System.out.print("Операция = ");
            optVal = in.nextInt();
        }

        switch (optVal) {
            case 1:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Результат = " + currentConverter.toUsd(amountVal));
                break;
            case 2:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Результат = " + currentConverter.toEuro(amountVal));
                break;
            case 3:
                if (optVal == 4 - currentVal) System.out.println(amountVal);
                else System.out.println("Результат = " + currentConverter.toRub(amountVal));
        }
    }
}