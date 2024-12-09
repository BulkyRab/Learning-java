
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax;
        System.out.println("Value of the gift?");
        int gif=Integer.parseInt(scan.nextLine());
        if(gif<5000){
            System.out.println("No tax!");
        }else if(gif<=25000 && gif>=5000){
            tax=(100+(gif-5000)*0.08);
            System.out.println("Tax: "+tax);
        }else if(gif<=55000 && gif>25000){
            tax=(1700+(gif-25000)*0.10);
            System.out.println("Tax: "+tax);
        }else if(gif<=200000 && gif>55000){
            tax=(4700+(gif-55000)*0.12);
            System.out.println("Tax: "+tax);
        }else if(gif<=1000000 && gif>200000){
            tax=(22100+(gif-200000)*0.15);
            System.out.println("Tax: "+tax);
        }else if(gif>1000000){
            tax=(142100+(gif-1000000)*0.17);
            System.out.println("Tax: "+tax);
        }
    }
}
