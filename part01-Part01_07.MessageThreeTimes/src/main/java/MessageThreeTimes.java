
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mensaje;

        System.out.println("Write a message:");
        mensaje=scanner.nextLine();
        System.out.println(mensaje);
        System.out.println(mensaje);
        System.out.println(mensaje);

    }
}
