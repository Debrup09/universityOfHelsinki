/*Find Leap Year
Expected Output:
Give a year: 1800
The year is not a leap year.
 */

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year is a leap Year");
        }   else {
            System.out.println("The year is not a leap year");
        }
    }
}
