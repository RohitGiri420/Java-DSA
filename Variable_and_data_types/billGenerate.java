/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill */

package Variable_and_data_types;

import java.util.Scanner;

public class billGenerate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Pencil,pen,erasor,total;

        System.out.print("Enter the amount of Pencil : ");
        Pencil = scanner.nextInt();

        System.out.print("Enter the amount of Pen : ");
        pen = scanner.nextInt();

        System.out.print("Enter the amount of Erasor : ");
        erasor = scanner.nextInt();

        total=Pencil+pen+erasor;
        System.out.println("Total Bill is : "+total);

        


    }

}
