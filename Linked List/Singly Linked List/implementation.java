public class singlylinkedlist {
     public node head;
    public static class node{
        int data;
        node next;
        public node(int v)
        {
            data=v;
            next=null;
        }
    }
    public static void main(String[] args){
        singlylinkedlist llist=new singlylinkedlist();
        llist.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        llist.head.next=second;
        second.next=third;
        llist.printlist();
    }
    public void printlist()
    {
        while (head!=null)
        {
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
}
