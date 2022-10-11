import java.util.Scanner;

public class main {

    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int num1 , num2 ,num3;
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        int max = num1;
        if(num2 > num1) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        System.out.printf("%d eh o maior\n",max);
    } 
    
}
// ==================================================
// ==================================================
// solution 2 


// import java.util.Scanner;

// public class LearnJava {

//     public static void main(String[] args ) {
//         Scanner in = new Scanner(System.in);
//         int num1 , num2 ,num3;
//         num1 = in.nextInt();
//         num2 = in.nextInt();
//         num3 = in.nextInt();
//         System.out.printf("%d eh o maior\n",Math.max(num1,Math.max(num3, num2)));
//     } 
    
// }


