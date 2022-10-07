package Age-in-days;
import java.util.Scanner;

public class main {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int age;
        age = in.nextInt();
        System.out.printf("%d ano(s)\n",age/365);
        System.out.printf("%d mes(es)\n",(age%365)/30);
        System.out.printf("%d dia(s)\n",(age%365)%30);
    }
}
