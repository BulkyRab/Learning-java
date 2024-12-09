
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class BirdDB {
    ArrayList<Bird> bird;
    
    BirdDB(){
        this.bird=new ArrayList<>();
    
    }
    
    public void addBird(Bird bird){
        this.bird.add(bird);
    }
    public void addObservationDB(String name){
        int contador=0;
        for(Bird e:bird){
            if(e.getName().equals(name)){
                e.addObservation();
            }else{
                contador++;
                if(contador==bird.size()){
                    System.out.println("Not a bird!");
                }

            }

        }
    }
    
    public void printAll(){
        for(Bird e:bird){
            System.out.println(e);
        }
    }
    
    public void printOne(String name){
        int contador=0;
        for(Bird e:bird){
            if(e.getName().equals(name)){
                System.out.println(e);
            }else{
                contador++;
                if(contador==bird.size()){
                    System.out.println("Not a bird!");
                }    
            }
        }
    }


    
    
}
