/*function to only accept positive numbers (only 0 to exit)
Expected Output:
Give a number:
10
Give a number:
0
 */
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }   else if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }   else {
                number = number * number;
            }

            System.out.println(number);
        }
    }
}
