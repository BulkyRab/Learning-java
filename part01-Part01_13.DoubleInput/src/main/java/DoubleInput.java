
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        double numero;
        System.out.println("Give a number:");
        texto=scanner.nextLine();
        numero=Double.valueOf(texto);
        System.out.println("You gave the number "+numero);
        
        

    }
}
