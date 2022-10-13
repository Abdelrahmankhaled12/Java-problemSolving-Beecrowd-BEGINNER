import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberX, numberY;
        numberX = in.nextInt();
        numberY = in.nextInt();
        switch (numberX) {
            case 1 -> System.out.printf("Total: R$ %.2f\n", numberY * 4.0);
            case 2 -> System.out.printf("Total: R$ %.2f\n", numberY * 4.50);
            case 3 -> System.out.printf("Total: R$ %.2f\n", numberY * 5.0);
            case 4 -> System.out.printf("Total: R$ %.2f\n", numberY * 2.0);
            case 5 -> System.out.printf("Total: R$ %.2f\n", numberY * 1.50);
        }

    }

}
