import java.util.Scanner;

public class main {

    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int number,workedHours;
        float hourlySalary;
        number = in.nextInt();
        workedHours = in.nextInt();
        hourlySalary = in.nextFloat();
        System.out.printf("NUMBER = %d\n",number);
        System.out.printf("SALARY = U$ %.2f\n",workedHours*hourlySalary);
   
    } 
    
}