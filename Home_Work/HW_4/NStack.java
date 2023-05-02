package Java_Sem_All.Home_Work.HW_4;
import java.util.LinkedList;

public class NStack{
      
    private LinkedList<Integer> arr = new LinkedList<>();

    void enqueue(int num){
        arr.add(num);
    }
        
    Object dequeue(){
        return arr.pollFirst();
    }
    
        Object first(){
            return arr.peekFirst();
    }
}

