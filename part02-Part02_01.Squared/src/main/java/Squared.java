/*Program that gives the square of the input
Expected Output:
4
16
 */

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        int squared = num * num;
        System.out.println(squared);
    }
}
