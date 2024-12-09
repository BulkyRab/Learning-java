
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma=0;
        while(true){
            System.out.println("Give a number:");
            int num=Integer.parseInt(scanner.nextLine());
            if(num==0){
                break;
            }else{
                suma=suma+num;
            }
        }
        System.out.println("Sum of the numbers: "+suma);
    }
}
