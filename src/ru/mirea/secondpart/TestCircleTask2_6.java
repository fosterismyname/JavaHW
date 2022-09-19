package ru.mirea.secondpart;

import java.util.Scanner;

class Circle {

    private double x = 0.0;
    private double y = 0.0;
    private double r = 1.0;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        if (r < 0) {
            System.out.println("Некорректное значение радиуса.");
            System.exit(0);
        }
        this.r = r;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleSquare() {
        return Math.PI * this.r * this.r;
    }

    public double circleLength() {
        return 2 * Math.PI * this.r;
    }

    // Сравнение окружностей -->
    public void circleCheck(Circle secondCircle) {

        System.out.println(" ");
        if (this.circleSquare() == secondCircle.circleSquare()) {
            System.out.println("1. Окружности равны по площади.");
        } else System.out.println("1. Окружности не равны по площади.");

        if (this.getX() == secondCircle.getX() && this.getY() == secondCircle.getY()) {
            System.out.println("2. Центры окружностей совпадают.");
        } else System.out.println("2. Центры окружностей не совпадают.");

        if (this.getR() == secondCircle.getR()) {
            System.out.println("3. Радиусы окружностей равны.");
        } else System.out.println("3. Радиусы окружностей не равны.");

        // Пересение окружностей -->
        double d = Math.sqrt(Pow((this.getX() - secondCircle.getX()), 2) + Pow((this.getY() - secondCircle.getY()), 2));
        if (this.getR() + secondCircle.getR() > d) {
            System.out.println("4. Окружности пересекаются.");
        } else System.out.println("4. Окружности не пересекаются.");

    }
    public void circleComprasion(Circle secondCircle) {
        if (this.circleSquare() == secondCircle.circleSquare()) {
            System.out.println("Окружности равны (эквивалентны по размерам).");
        } else System.out.print("Окружности не равны (площади не эквивалентны).");

    }
    public double Pow(double exp, int mant) {
        double result = 1.0;
        for (int i = 0; i < mant; i++) {
            result = result * exp;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Current circle: [x = " + x + ", y = " + y + ", r = " + r + " ]";
    }
}

public class TestCircleTask2_6 {

    public static void main(String[] args) {

        Circle firstCircle = new Circle(1.0, 1.0, 1.0);
        firstCircle.setX(3.0);
        firstCircle.setY(5.0);
        firstCircle.setR(10.0);

        Circle secondCircle = new Circle(1.0, 1.0, 1.0);
        secondCircle.setX(-3.0);
        secondCircle.setY(-5.0);
        secondCircle.setR(10.0);

        System.out.println("S = " + firstCircle.circleSquare());
        System.out.println("L = " + secondCircle.circleLength());

        firstCircle.circleCheck(secondCircle);
    }
}

