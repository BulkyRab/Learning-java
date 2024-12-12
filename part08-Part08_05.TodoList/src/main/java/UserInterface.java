
import java.util.Scanner;


public class UserInterface {
    public TodoList list;
    public Scanner scan;

    public UserInterface(TodoList list,Scanner scan){
        this.list=list;
        this.scan=scan;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command=scan.nextLine();

            switch(command){
                case "add":
                    System.out.print("To add: ");
                    String task=scan.nextLine();
                    list.add(task);
                    break;
                case "list":
                    this.list.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int num=Integer.parseInt(scan.nextLine());
                    list.remove(num);
                    break;
                case "stop":
                    System.exit(0);
            }
        }
    }
    
}
