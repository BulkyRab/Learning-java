
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo;
        double divi;
        System.out.println("Give the first number:");
        primero=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        segundo=Integer.parseInt(scanner.nextLine());
        divi=(1.0 *primero+segundo)/2;
        System.out.println("The average is "+divi);
    }
}
