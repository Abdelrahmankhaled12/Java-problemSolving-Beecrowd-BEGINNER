import java.util.Scanner;

public class main {

    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        System.out.printf("DIFERENCA = %d\n",((a*b) - (c*d)));
    } 
    
}
