package ru.mirea.secondpart;

import java.util.*;

public class HowManyTask2_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int counter = 0;
        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();
            //System.out.println(s1);
            counter = counter + 1;
        }
        System.out.println("The count of entered words: " + counter);
    }
}
