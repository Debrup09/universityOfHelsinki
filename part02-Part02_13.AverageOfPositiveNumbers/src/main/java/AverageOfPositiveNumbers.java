/* average of the given positive numbers
Expected Output:
3
5
1
-3
0
3.0
 */

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }   else if (number > 0) {
                sum += number;
                amount++;
            }
        }
        double average = (double) sum / amount;
        System.out.println(average);

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
