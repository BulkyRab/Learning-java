
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero,segundo,suma;
        double raiz;
        
        primero=Integer.parseInt(scanner.nextLine());
        segundo=Integer.parseInt(scanner.nextLine());
        suma=primero+segundo;
        raiz=Math.sqrt(suma);
        System.out.println(raiz);

    }
}
