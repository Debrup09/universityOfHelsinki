/* a function that always returns the absolute value of a number that is its
value without any positive or negative sign
Expected output:
-5
5
 */

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 0) {
            num = num * -1;
            System.out.println(num);
        }   else {
            System.out.println(num);
        }
    }
}
