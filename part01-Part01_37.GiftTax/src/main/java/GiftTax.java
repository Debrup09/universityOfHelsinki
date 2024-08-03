/* Calculate gift tax based on the chart
Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
5 000 — 25 000	100	8
25 000 — 55 000	1 700	10
55 000 — 200 000	4 700	12
200 000 — 1 000 000	22 100	15
1 000 000 —	142 100	17

Expected Output:
Value of the gift?
27500
Tax: 1950.0
 */

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = scan.nextInt();

        double tax;
        double taxRate;
        double lowerLimit = 5_000;
        double lowerLimitTax;

        if (value < 5_000) {
            System.out.println("No tax!");
        }   else if (value >= lowerLimit && value < 25_000) {
            taxRate = 0.08;
            lowerLimit = 5_000;
            lowerLimitTax = 100;
            tax = lowerLimitTax + ((value - lowerLimit) * taxRate);

            System.out.println("Tax: " + tax);
        }   else if (value >= lowerLimit && value < 55_000) {
            taxRate = 0.1;
            lowerLimit = 25_000;
            lowerLimitTax = 1_700;
            tax = lowerLimitTax + ((value - lowerLimit) * taxRate);

            System.out.println("Tax: " + tax);
        }   else if (value >= lowerLimit && value < 200_000) {
            taxRate = 0.12;
            lowerLimit = 55_000;
            lowerLimitTax = 4_700;
            tax = lowerLimitTax + ((value - lowerLimit) * taxRate);

            System.out.println("Tax: " + tax);
        }   else if (value >= lowerLimit && value < 1_000_000) {
            taxRate = 0.15;
            lowerLimit = 200_000;
            lowerLimitTax = 22_100;
            tax = lowerLimitTax + ((value - lowerLimit) * taxRate);

            System.out.println("Tax: " + tax);
        }   else {
            taxRate = 0.17;
            lowerLimit = 1_000_000;
            lowerLimitTax = 142_100;
            tax = lowerLimitTax + ((value - lowerLimit) * taxRate);
            System.out.println("Tax: " + tax);
        }
    }
}
