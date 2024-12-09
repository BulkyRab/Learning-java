
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String texto;
        int numero;
        double doble;
        boolean boleano;
        System.out.println("Give a string:");
        texto=String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        numero=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        doble=Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boleano=Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string "+texto);
        System.out.println("You gave the integer "+numero);
        System.out.println("You gave the double "+doble);
        System.out.println("You gave the boolean "+boleano);

    }
}
