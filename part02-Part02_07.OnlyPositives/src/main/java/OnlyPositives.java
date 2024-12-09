
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int numero=Integer.parseInt(scanner.nextLine());
            
            if(numero<0){
                System.out.println("Unsuitable number");
                continue;
            }
            
            if(numero>0){
                numero=numero*numero;
                System.out.println(numero);
                continue;
            }else{
                break;
            }
            
        }
    }
}
