public class circularinsertend {
    private listnode last;
    private int length;
    public class listnode{
        private listnode next;
        private int data;
        public listnode(int data){
            this.data=data;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEqual(){
        return length==0;
    }
    public circularinsertend(){
        last=null;
        length=0;
    }
    public void display(){
        if(last==null)
            return;
        listnode first=last.next;
        while (last!=null)
        {
            System.out.println(" "+first.data+" ");
            first=first.next;
        }
        System.out.println(" "+first.data+" ");
    }
    public void insertend(int v){
        listnode t=new listnode(v);
        if(last==null){
            last=t;
            last.next=last;
        }
        else{
            t.next=last.next;
            last.next=t;
            last=t;
        }
        length++;
    }
    public static void main(String[] args){
        circularinsertend c=new circularinsertend();
        c.insertend(1);
        c.insertend(2);
        c.display();
    }
}
