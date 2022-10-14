import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int numbers[], numbersRight[];
        numbers = new int[3];
        numbersRight = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = in.nextInt();
            numbersRight[i] = numbers[i];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (numbersRight[i] > numbersRight[j]) {
                    int swap = numbersRight[i];
                    numbersRight[i] = numbersRight[j];
                    numbersRight[j] = swap;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numbersRight[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }

}