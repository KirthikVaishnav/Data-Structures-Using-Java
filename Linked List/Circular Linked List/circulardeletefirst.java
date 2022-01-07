import java.util.NoSuchElementException;

public class circulardeletefirst {
    private listnode last;
    private int length;
    public class listnode{
        private listnode next;
        private int data;
        public listnode(int v){
            this.data=v;
        }
    }
    public int Length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public circulardeletefirst(){
        last=null;
        length=0;
    }
    public void display(){
        if(last==null)
            return;
        listnode temp=last.next;
        while(last!=temp)
        {
            System.out.println(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" "+temp.data+" ");
    }
    public void insertfirst(int v){
        listnode temp=new listnode(v);
        if (last==null)
            last=temp;
        else {
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public listnode removefirst(){
        if(isEmpty())
            throw new NoSuchElementException("");
        listnode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }
    public static void main(String[] args){
        circulardeletefirst c=new circulardeletefirst();
        c.insertfirst(1);
        c.insertfirst(2);
        c.insertfirst(3);
        c.display();
        c.removefirst();
        c.display();
    }
}
