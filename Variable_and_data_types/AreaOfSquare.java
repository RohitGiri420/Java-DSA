/*In a program, input the side of a square. You have to output the area of the
square */

package Variable_and_data_types;

/**
 * AreaOfSquare
 */

 import java.util.Scanner;
public class AreaOfSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int side;
        
        System.out.print("Enter the Side of Square : ");
        side = scanner.nextInt();

        int area = side*side;

        System.out.println("Area of Square is : "+area);
        
    }
}