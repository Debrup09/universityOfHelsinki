
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String line = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double value = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean isTrue = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + line);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + value);
        System.out.println("You gave the boolean " + isTrue);
    }
}
