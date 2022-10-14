import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int number, count = 0;
        for (int i = 0; i < 5; i++) {
            number = in.nextInt();
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.printf("%d valores pares\n", count);

    }

}