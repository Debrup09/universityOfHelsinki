
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String x = scanner.nextLine();
        
        System.out.println("What is their job?");
        String y = scanner.nextLine();
        
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + x + ", who was " + y + ".");
        System.out.println("On the way to work, " + x + " reflected on life.");
        System.out.println("Perhaps " + x + " will not be " + y + " forever.");
    
        

        // Write your program here

    }
}
