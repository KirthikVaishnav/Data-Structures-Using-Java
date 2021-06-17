public class deleteatstart {
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
        deleteatstart llist=new deleteatstart();
        llist.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        llist.head.next=second;
        second.next=third;
        deleteatstart.deletestart();
        deleteatstart.printlist();
    }
    public static void printlist()
    {
        while(head!=null)
        {
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
            head=head.next;
        }
    }
    public static void deletestart()
    {
        if(head==null)
        {
            throw new IllegalStateException("Empty List Exception");
        }
        node temp=head;
        head=head.next;
        temp.next=null;
        
    }
}
