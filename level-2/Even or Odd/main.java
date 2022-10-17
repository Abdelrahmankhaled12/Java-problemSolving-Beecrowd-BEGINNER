package com.mycompany.main;

import java.util.Scanner; // scanner is in the java.until package

public class main {

    public static void main(String[] args) {
        // create a scanner object
        Scanner in = new Scanner(System.in);
        int size;
        // entar a size loop 
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            int number = in.nextInt();
            String x;
            // check number => odd || Even || Null
            if (number > 0) {
                // check positive or nagative
                x = number % 2 == 0 ? "EVEN POSITIVE" : "ODD POSITIVE";
                System.out.println(x);
            } else if (number == 0) {
                System.out.println("NULL");
            } else {
                // check positive or nagative
                x = number % 2 == 0 ? "EVEN NEGATIVE" : "ODD NEGATIVE";
                System.out.println(x);
            }
        }

    }
}
