package Area_of_a_Circle;
import java.util.Scanner;

public class main {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double Area = 3.14159 * radius * radius;
        System.out.printf("A=%.4f\n",Area);
    }
}
