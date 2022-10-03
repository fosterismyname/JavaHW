package ru.mirea.fourthpart.firstPart;

import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
        System.out.println("Любимое время года: ");
        getInfo(Seasons.valueOf("SUMMER"));
    }

    public static void choiceVar() {

        Seasons currentSeason = Seasons.AUTUMN;

        switch (currentSeason) {

            case WINTER -> System.out.println("Я люблю зиму!");
            case SUMMER -> System.out.println("Я люблю лето!");
            case AUTUMN -> System.out.println("Я люблю осень!");
            case SPRING -> System.out.println("Я люблю весну!");
            default -> System.out.println("Ошибка: неверное время года!");

        }
    }

    public static void getInfo(Seasons season) {
        System.out.println(season.name() + " " + season);
        season.getDescription();
    }
}
