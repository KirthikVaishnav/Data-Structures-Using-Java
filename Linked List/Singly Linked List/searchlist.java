import java.util.Scanner;
public class searchlist {
    public static node head;
    public static class node{
        int data;
        node next;
        node(int x)
        {
            data=x;
            next=null;
        }
    }
    public static void main(String[] args)
    {
        searchlist llist=new searchlist();
        llist.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        llist.head.next=second;
        second.next=third;
        searchlist.printlist();
        Scanner obj=new Scanner(System.in);
        int k;
        System.out.println("Value of node to be searched:");
        k=obj.nextInt();
        searchlist.search(k);

    }
    public static void printlist(){
        while(head!=null)
        {
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
            head=head.next;
        }
    }
    public static void search(int s){
       node temp=head;
       if(temp!=null)
       {
           if(temp.data==s)
           {
               System.out.println("Found");
           }
           temp=temp.next;
       }
    }
}
