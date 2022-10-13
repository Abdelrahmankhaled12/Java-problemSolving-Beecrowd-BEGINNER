import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float sum = 0;
        int   count=0;
        for (int i = 1; i <= 6; i++) {
            float number;
            number = in.nextFloat();
            if (number > 0) {
                sum+=number;
                count++;
            }
        }
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n",(sum/count));
    }
}