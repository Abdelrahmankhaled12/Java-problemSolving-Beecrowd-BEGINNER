import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        int count = 0;
        for (int i = x;; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            if (count == 6) {
                break;
            }
        }

    }
}