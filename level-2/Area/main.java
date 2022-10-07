package Area;
import java.util.Scanner;

public class main {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        float a,b,c;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
          System.out.printf("TRIANGULO: %.3f\n",(a*c*0.5));
          System.out.printf("CIRCULO: %.3f\n",(c*c*3.14159));
          System.out.printf("TRAPEZIO: %.3f\n",(0.5*(a+b)*c));
          System.out.printf("QUADRADO: %.3f\n",(b*b));
          System.out.printf("RETANGULO: %.3f\n",a*b);
    }
}
