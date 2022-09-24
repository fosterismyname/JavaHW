package ru.mirea.thirdpart.secondtask;

import java.util.Random;
import java.util.Scanner;

class Tester {

    public static void main(String[] args) {
        //test for exmp of class Point
        System.out.println("-----------------");

        Point firstPnt = new Circle(1, 1); //circle -> point

        System.out.println("x = " + firstPnt.getXofPoint());
        System.out.println("y = " + firstPnt.getYofPoint());

        //test for exmp of class Circle
        Circle firstCircle = new Circle(1, 1, 1);

        System.out.println(firstCircle.getXofPoint());
        System.out.println(firstCircle.getYofPoint());
        System.out.println(firstCircle.mathArea());
        System.out.println(firstCircle.mathLength());

        Circle circleDowncast = (Circle)firstCircle; // point -> circle
        System.out.println(circleDowncast.getXofPoint());
        System.out.println(circleDowncast.getYofPoint());
        System.out.println(circleDowncast.getR());

        System.out.println("-----------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int value = in.nextInt();
        Circle[] mainArr = new Circle[value];

        for (int i = 0; i < value; i++) {
            mainArr[i] = new Circle(randomInteger(0, 10), randomInteger(0, 10), randomInteger(0, 10));
        }

        System.out.print("Начальный массив объектов Circle: ");

        printArr(mainArr);
        maximumCircle(mainArr);
        minimumCircle(mainArr);
        circleRegulation(mainArr);

        System.out.print("Отсортированный массив объектов Circle: ");
        printArr(mainArr);

    }

    public static int randomInteger(int leftBorder, int rightBorder) {
        Random rand = new Random();
        return rand.nextInt((rightBorder - leftBorder) + 1) + leftBorder;
    }

    public static void printArr(Circle[] currArr) {
        for (int i = 0; i < currArr.length; i++) {
            System.out.print(currArr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void maximumCircle(Circle[] currArr) { //the key of choice is radius

        if (currArr.length != 0) {
            int maximumIndex = 0;
            Circle maximumArr = currArr[0];

            for (int i = 0; i < currArr.length; i++) {
                if (currArr[i].getR() > maximumArr.getR()) {
                    maximumArr = currArr[i];
                    maximumIndex = i;
                }
            }
            System.out.println("Экземпляр с наибольшим радиусом: " + maximumArr);
        }
    }

    public static void minimumCircle(Circle[] currArr) { //the key of choice is radius

        if (currArr.length != 0) {
            int minimumIndex = 0;
            Circle minimumArr = currArr[0];

            for (int i = 0; i < currArr.length; i++) {
                if (currArr[i].getR() < minimumArr.getR()) {
                    minimumArr = currArr[i];
                    minimumIndex = i;
                }
            }
            System.out.println("Экземпляр с наименьшим радиусом: " + minimumArr);
        }
    }

    public static void circleRegulation(Circle[] currArr) { //the key of sorting exmp's is radius

        //sorting exmp of Circles by radius
        for (int i = 0; i < currArr.length - 1; i++) {
            for (int j = 0; j < currArr.length - i - 1; j++) {
                if (currArr[j].getR() > currArr[j + 1].getR()) {
                    Circle tmp = currArr[j];
                    currArr[j] = currArr[j + 1];
                    currArr[j + 1] = tmp;
                }
            }
        }
    }

}
