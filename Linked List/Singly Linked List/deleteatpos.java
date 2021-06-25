public class deleteaatpos {
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
        deleteaatpos llist=new deleteaatpos();
        llist.head=new node(1);
        node second=new node(2);
        node  third=new node(3);
        node fourth=new node(4);
        node fifth=new node(5);
        llist.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        deleteaatpos.deletepos(4);
        deleteaatpos.printlist();
    }
    public static void printlist(){
        while(head!=null)
        {
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
            head=head.next;
        }
    }
    public static void deletepos(int pos)
    {
        node pre=head;
        int count=1;
        while(count<pos-1)
        {
            pre=pre.next;
            count++;
        }
        node current=pre.next;
        pre.next=current.next;
        current.next=null;
    }
}
