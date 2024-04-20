//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative.

package Conditions;

import java.util.Scanner;

public class findNumPosOrNeg {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = scan.nextInt();

        if(num <0){
            System.out.println("Number is negative");
        }
        else if (num == 0){
            System.out.println("Number is Zero");
        }

        else{
            System.out.println("Number is Positive");
        }

    }
}
