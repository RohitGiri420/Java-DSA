package Variable_and_data_types;

import java.util.Scanner;;

public class CalcAvg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter Num 1 : ");
        a = scanner.nextInt();

        System.out.print("Enter Num 2 : ");
        b = scanner.nextInt();

        System.out.print("Enter Num 3 : ");
        c = scanner.nextInt();

        float avg = (a + b + c) / 3;

        System.out.println("\nAvg of these three number is :" + avg);
        
    }
}