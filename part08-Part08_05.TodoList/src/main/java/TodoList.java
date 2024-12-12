
import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> list;

    public TodoList(){
        this.list=new ArrayList<>();

    }

    public void add(String task){
        this.list.add(task);

    }

    public void print(){
        int contador =1;
        for(String e:list){
            System.out.println(contador+": "+e);
            contador++;
        }
    }

    public void remove(int number){
        this.list.remove(number-1);
    }
    
}
