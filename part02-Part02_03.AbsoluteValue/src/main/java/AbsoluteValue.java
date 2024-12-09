
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero=Integer.parseInt(scanner.nextLine());
        if(numero<0){
            numero=numero*-1;
            System.out.println(numero);
        }else{
            System.out.println(numero);
        }
    }
}
