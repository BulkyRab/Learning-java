
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class TextInterface {
    private Scanner scan;
    private BirdDB birddb;
    
    
    public TextInterface(Scanner scan,BirdDB bird){
        this.birddb=bird;
        this.scan=scan;
    
    }
    
    public void Star(){
        boolean loop=true;
        
        
        while(loop){
            System.out.print("? ");
            String command=scan.nextLine();
            switch(command){
                case "Quit":
                    System.exit(0);
                    break;
                case "Add":
                    System.out.print("Name: ");
                    String name=scan.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName=scan.nextLine();
                    birddb.addBird(new Bird(name,latinName));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String bird=scan.nextLine();
                    birddb.addObservationDB(bird);
                    break;
                case "All":
                    birddb.printAll();
                    break;
                case "One":
                    System.out.print("Bird?");
                    String nameb=scan.nextLine();
                    birddb.printOne(nameb);
                    break;
                default:
                    System.out.println("Unknow command;");
            }
        
        
        }
    
    
    }
    
}
