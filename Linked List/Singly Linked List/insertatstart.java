public class insertatstart {
    public static node head;
    public static class node{
        int data;
        node next;
        public node(int v){
            data=v;
            next=null;
        }
    }
    public static void main(String[] args)
    {
        insertatstart st=new insertatstart();
        st.head=new node(2);
        node second=new node(3);
        node third=new node(4);
        st.head.next=second;
        second.next=third;

        st.insertstart(1);
        st.printlist();

    }
    public static void insertstart(int value){
        node new_node=new node(value);
        new_node.next=head;
        head=new_node;
    }
    public  void printlist(){
        while(head!=null)
        {
            System.out.println(head.data+" ");
            System.out.println(head.next+" ");
            head=head.next;
        }
    }
}
