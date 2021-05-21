public class insertatend {
    public static node head;
    public static class node{
        int data;
        node next;
        public node(int v)
        {
            data=v;
            next=null;
        }
    }
    public static void main(String[] args)
    {
        insertatend liste=new insertatend();
        liste.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        liste.head.next=second;
        second.next=third;
        insertatend.insertend(4);
        insertatend.printlist();
    }
    public static void insertend(int n)
    {
        node newn=new node(n);
        if(head==null)
        {
            head=new node(n);
            return;
        }
        newn.next=null;
        node last=head;
        while (last.next!=null)
        {
            last=last.next;
        }
            last.next=newn;
            return;

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
}
