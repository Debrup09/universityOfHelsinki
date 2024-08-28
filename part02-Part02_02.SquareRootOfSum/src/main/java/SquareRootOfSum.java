/* square root the sum of two numbers which is given as input
Expected Output:
4
5
3
 */
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num3 = num1 + num2;

        double sqrt = Math.sqrt(num3);
        System.out.println(sqrt);

    }
}
