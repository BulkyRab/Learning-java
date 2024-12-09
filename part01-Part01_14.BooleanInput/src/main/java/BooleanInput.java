
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;
        boolean boleano;
        System.out.println("Write something:");
        texto=scanner.nextLine();
        boleano=Boolean.valueOf(texto);
        System.out.println("True or false? "+boleano);
    }
}
