
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo,tercero,suma;
        System.out.println("Give the first number:");
        primero=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        segundo=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        tercero=Integer.parseInt(scanner.nextLine());
        suma=primero+segundo+tercero;
        System.out.println("The sum of the numbers is "+suma);

    }
}
