package com.mycompany.main;

import java.util.Scanner; // scanner is in the java.until package

public class main {

    public static void main(String[] args) {
        // create a scanner object
        Scanner in = new Scanner(System.in);
        int size , count = 1;
        // entar a size loop 
        size = in.nextInt();
        for (int i = 1; i <= size; i++) {
            // nested loop => ouput 1 2 3 PUM
            for (int j = 1; j <= 4; j++) {
                if (j == 4) {
                    System.out.println("PUM");
                    count++;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
        }

    }
}
