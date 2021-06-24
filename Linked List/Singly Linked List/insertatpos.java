public class insertatpos {
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
    public static void main(String[] args){
        insertatpos llist=new insertatpos();
        llist.head=new node(1);
        node s=new node(2);
        node f=new node(4);
        node fi=new node(5);
        llist.head.next=s;
        s.next=f;
        f.next=fi;
        insertatpos.insertatapoint(3,3);
        insertatpos.printlist();
    }
    public static void insertatapoint(int v,int pos){
        node temp=new node(v);
        int count=1;
        node previous=head;
        while(count<pos-1)
        {
            previous=previous.next;
            count++;
        }
        node c=previous.next;
        temp.next=c;
        previous.next=temp;
    }
    public static void printlist(){
        while (head!=null)
        {
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
            head=head.next;
        }
    }
}
