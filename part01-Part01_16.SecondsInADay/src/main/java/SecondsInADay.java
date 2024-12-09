
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos;
        System.out.println("How many days would you like to convert to seconds?");
        segundos=Integer.parseInt(scanner.nextLine());
        segundos=(segundos*86400)/1;
        System.out.println(segundos);

    }
}
