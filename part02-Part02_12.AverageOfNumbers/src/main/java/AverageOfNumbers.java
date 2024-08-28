/* Average of the given numbers
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
Average of the numbers: 8.5
 */

import java.util.Scanner;

public class AverageOfNumbers {

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

        double average = (double) sum / amount;
        System.out.println("Average of the numbers: " + average);
    }
}
