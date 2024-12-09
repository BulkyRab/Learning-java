
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primero=Integer.parseInt(scanner.nextLine());
        int segundo=Integer.parseInt(scanner.nextLine());
        
        if(primero>segundo){
            System.out.println(primero+" is greater than "+segundo+".");
        }else if(primero==segundo){
            System.out.println(primero+" is equal to "+segundo+".");
        }else{
            System.out.println(primero+" is smaller than "+segundo+".");
        }
    }
}
