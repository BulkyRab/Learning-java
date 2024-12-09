
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String texto;
        System.out.println("Give a number:");
        texto=scanner.nextLine();
        numero=Integer.parseInt(texto);
        System.out.println("You gave the number "+numero);

    }
}
