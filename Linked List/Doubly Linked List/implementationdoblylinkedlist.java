public class dblist {
    public listnode head;
    public listnode tail;
    public int length;

    public class listnode{
        listnode next;
        listnode prev;
        int data;
        public listnode(int data)
        {
            this.data=data;
        }
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }
    
    public dblist(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
}
