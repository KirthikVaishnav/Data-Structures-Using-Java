public class insertbegi {
    listnode head;
    listnode tail;
    int length;
    public class listnode{
        int data;
        listnode next;
        listnode  prev;
        public listnode(int data ){
            this.data=data;
        }
    }
    public insertbegi(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public int isEmpty(){
        if(head==null)
            return 0;
        else
            return length;
    }
    public void insertbegin(int v){
        listnode n=new listnode(v);
        if(tail==null)
            tail=n;
        else
            head.prev=n;
        n.next=head;
        head=n;
    }
    public void print(){
        if(head==null)
            return ;
        listnode t=head;
        while(t!=null)
        {
            System.out.print(t.data+"-->");
            t=t.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args)
    {
        insertbeg d=new insertbeg();

        d.insertbegin(1);
        d.insertbegin(2);
        d.insertbegin(3);
        d.insertbegin(4);
        d.insertbegin(5);
        d.print();
    }
}
