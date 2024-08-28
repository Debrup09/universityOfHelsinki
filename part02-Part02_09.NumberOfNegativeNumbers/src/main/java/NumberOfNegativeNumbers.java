/* write a program to check the amount of negative numbers inputted
Expected Output:
Give a number:
-2
Give a number:
3
Give a number:
0
Number of numbers: 1
 */

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }   else if (number < 0) {
                amount++;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + amount);
    }
}
