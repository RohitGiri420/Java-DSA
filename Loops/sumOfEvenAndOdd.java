package Loops;

import java.util.Scanner;

public class sumOfEvenAndOdd {

    public static void main(String[] args) {
        
        int evenSum=0;
        int oddSum=0;
        int resume =1;
        Scanner scan = new Scanner(System.in);  

        while (resume ==1) {

            int num = scan.nextInt();

            evenSum += (num%2==0)?num:0;
            oddSum += (num%2!=0)?num:0;

            System.out.println("press 1 for ontinue");
            resume = scan.nextInt();
            }

            System.out.println("even sum : "+evenSum);
            System.out.println("Odd sum : "+ oddSum);

        }

    }
    

