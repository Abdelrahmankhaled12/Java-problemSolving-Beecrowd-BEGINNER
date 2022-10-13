import java.io.IOException;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int sum = 0, start, end;
        start = in.nextInt();
        end = in.nextInt();
        if(start > end){
            int swap = start;
            start = end;
            end = swap;
        }
        for (int i = start+1; i <end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}