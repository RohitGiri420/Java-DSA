package Conditions;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("enter year : ");
        int year = scan.nextInt();

        if(year%4==0){

            if (year%100 !=0) {
                System.out.println("this is leap year");
                
            }

            else {
                if (year%400 ==0) {
                    System.out.println(" this is leap year");
                }
                else{
                    System.out.println("this is not a leap year");
                }
                
            }

        }

        else{
            System.out.println("this is not Leap year");
        }
    }
    
}
