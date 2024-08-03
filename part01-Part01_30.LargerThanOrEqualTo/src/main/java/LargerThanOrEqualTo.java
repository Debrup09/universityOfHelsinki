/* Must give the greater number as output
Expected Output:
Give the first number:
5
Give the second number:
8
Greater number is: 8
 */

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = scan.nextInt();
        System.out.println("Give the second number:");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        }   else if (num1 < num2) {
            System.out.println("Greater number is: " + num2);
        }   else {
            System.out.println("The numbers are equal!");
        }
    }
}
