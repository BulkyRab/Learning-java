
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo,multi;
        System.out.println("Give the first number:");
        primero=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        segundo=Integer.parseInt(scanner.nextLine());
        multi=primero*segundo;
        System.out.println(primero+" * "+segundo+" = "+multi);
    }
}
