package ru.mirea.secondpart;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class PokerTask2_9 {

    public static void main(String[] args) {
        int CardsCntToPerson = 5;
        int players;

        String[] lears = {"Пики", "Буби", "Крести", "Черви"};
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int cardsCount = 52;

        // -->
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Для завершения игры введите -1.");
            System.out.print("Количество игроков = ");

            if (in.hasNext()) {
                players = in.nextInt();
                if (players * CardsCntToPerson <= cardsCount) break;
                else {
                    if (players == -1) {
                        System.out.println("Конец игры.");
                        break;
                    } else System.out.println("Введите корректное число игроков.");
                }
            }
        }

        // -->
        ArrayList<String> cardsDeck = new ArrayList<String>();
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < lears.length; j++) {
                cardsDeck.add(value[i] + " " + lears[j]);
            }
        }

        // -->
        Collections.shuffle(cardsDeck);
        System.out.println(" ");

        // -->
        for (int i = 0; i < players * CardsCntToPerson; i++) {
            System.out.println(((i) % 5 + 1) + " карта: " + cardsDeck.get(i));
            if (i % CardsCntToPerson == CardsCntToPerson - 1) {
                System.out.println("Колода №" + (i / CardsCntToPerson + 1) + " ^");
                System.out.println(" ");
            }
        }
    }
}