/*Write a program by using the loop example that asks
"Shall we carry on?" until the user inputs the string "no".
Expected Output:
yo
Shall we carry on?
no
 */

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");
        
        while (true) {
            String ans = scanner.nextLine();
            if (ans.equals("no")) {
                break;
            }
            System.out.println("Shall we carry on?");
        }
    }
}
