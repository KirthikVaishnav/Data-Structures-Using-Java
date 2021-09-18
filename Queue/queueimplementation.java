import java.util.*;
public class queueimplementation {
       public static void main(String args[])
       {
           Queue<String> p=new PriorityQueue<>();
           p.add("This");
           p.add("is");
           p.add("Queue");
           Iterator i= p.iterator();
           while (i.hasNext())
           {
               System.out.println(i.next()+" ");
           }
       }
}
