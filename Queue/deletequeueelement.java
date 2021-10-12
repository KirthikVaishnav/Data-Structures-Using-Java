import java.util.PriorityQueue;
import java.util.Queue;

public class deletequeueelement {
    public static void main(String args[]){
        Queue<Integer> obj=new PriorityQueue<>();
        obj.add(0);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println("Initial Queue:"+obj);
        obj.remove(2);
        System.out.println("Final Queue:"+obj);
    }
}
