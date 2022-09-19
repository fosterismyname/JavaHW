package ru.mirea.secondpart;

import java.util.Scanner;

public class TestBallTask2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        System.out.print("x = ");
        x = in.nextInt();
        System.out.print("y = ");
        y = in.nextInt();
        Ball currentBall = new Ball(x, y);
        System.out.println(currentBall); // [x = 0.0, y = 0.0]
        currentBall.setX(10);
        currentBall.setY(-10);
        System.out.println(currentBall); // [x = 10.0, y = -10.0]
        currentBall.setXY(0, 20);
        System.out.println(currentBall); // [x = 100.0, y = -20.0]
        System.out.print("Перемещение по оси ОХ = ");
        x = in.nextDouble();
        System.out.print("Пермещение по оси ОУ = ");
        y = in.nextDouble();
        currentBall.move(x, y);
        System.out.println(currentBall);
    }

}

class Ball {
    private double x, y;

    public Ball() {};

    public Ball (double x, double y) {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y) {
        setX(x);
        setY(y);
    }

    public void move(double xDisp, double yDisp) {
        //this.x = x + xDisp;
        //this.y = y + yDisp;
        setX(x + xDisp);
        setY(y + yDisp);
    }

    @Override
    public String toString() {
        return "Ball: [" + "x = " + x + ", y = " + y + ']';
    }
}
