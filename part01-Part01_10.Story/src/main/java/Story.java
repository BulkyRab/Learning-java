
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre,profesion;
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        nombre=scanner.nextLine();
        System.out.println("What is their job?");
        profesion=scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+nombre+", who was "+profesion+".");
        System.out.println("On the way to work, "+nombre+" reflected on life.");
        System.out.println("Perhaps "+nombre+" will not be "+profesion+" forever.");
        

        // Write your program here

    }
}
