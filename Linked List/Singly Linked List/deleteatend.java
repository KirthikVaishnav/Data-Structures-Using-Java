public class deleteatend {
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
        deleteatend llist=new deleteatend();
        llist.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        llist.head.next=second;
        second.next=third;
        deleteatend.deleteend();
        deleteatend.printlist();
    }
    public static void printlist()
    {
        while(head!=null) {
            System.out.println(head.data + " ");
            System.out.println(head.next + " ");
            head = head.next;
        }
    }
    public static void deleteend()
    {
        node last=head;
        node pnode=null;
        while(last.next!=null)
        {
            pnode=last;
            last=last.next;
        }
        pnode.next=null;
    }
}
