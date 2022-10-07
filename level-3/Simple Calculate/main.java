import java.util.Scanner;

public class main {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        float a,sum;
        int b,c;
        b = in.nextInt();
        c = in.nextInt();
        a = in.nextFloat();
        sum = c*a;
        b = in.nextInt();
        c = in.nextInt();
        a = in.nextFloat();
        sum = c*a + sum;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",sum);
}
}
