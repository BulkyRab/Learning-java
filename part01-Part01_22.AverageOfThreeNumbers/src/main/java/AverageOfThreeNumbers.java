
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo,tercero;
        double division;
        System.out.println("Give the first number:");
        primero=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        segundo=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        tercero=Integer.parseInt(scanner.nextLine());
        division=(1.0*primero+segundo+tercero)/3;
        System.out.println("The average is "+division);
    }
}
