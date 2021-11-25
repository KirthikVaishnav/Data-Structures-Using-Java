public class printdblist {
    public listnode head;
    public listnode tail;
    public int length;
    public printdblist(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public class listnode{
        int data;
        listnode next;
        listnode prev;
        public listnode(int data){
            this.data=data;
        }
    }
    public void printforward(){
        if(head==null)
            return;
        listnode temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void printbackward(){
        if(tail==null)
            return;
        listnode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public void insertlast(int v){
        listnode newnode=new listnode(v);
        if(head==null)
            head=newnode;
        else
            tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        length++;
    }
    public static void main(String[] args)
    {
        printdblist list=new printdblist();
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(3);
        list.insertlast(4);
        list.insertlast(5);
        list.printforward();
        list.printbackward();
    }
}
