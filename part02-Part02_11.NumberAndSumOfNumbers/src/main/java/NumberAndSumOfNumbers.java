/*Program to provide the amount of numbers and their sum
Expected Output:
Give a number:
5
Give a number:
22
Give a number:
9
Give a number:
-2
Give a number:
0
Number of numbers: 4
Sum of the numbers: 34
 */

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }   else {
                sum += number;
                amount++;
            }
        }
        System.out.println("Number of numbers: " + amount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
