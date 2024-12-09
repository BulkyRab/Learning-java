
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo,suma,resta,multi;
        double divi;
        System.out.println("Give the first number:");
        primero=Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        segundo=Integer.parseInt(scanner.nextLine());
        suma=primero+segundo;
        resta=primero-segundo;
        multi=primero*segundo;
        divi=(double) primero/segundo;
        System.out.println(primero+" + "+segundo+" = "+suma);
        System.out.println(primero+" - "+segundo+" = "+resta);
        System.out.println(primero+" * "+segundo+" = "+multi);
        System.out.println(primero+" / "+segundo+" = "+divi);
    }
}
