/*Write a program that asks the user to input values
 until they input the value 4.
 Expected Output:
 Give a number:
 0
 Give a number:
 4
 */

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        

        while (true) {
            int number = scanner.nextInt();
            if (number == 4) {
                break;
            }
            System.out.print("Give a number: ");
        }
    }
}
