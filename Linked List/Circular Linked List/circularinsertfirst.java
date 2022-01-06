public class circularinsertfirst {
    private listnode last;
    private int length;
    private class listnode{
        private listnode next;
        private int data;
        private listnode(int data)
        {
            this.data=data;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public circularinsertfirst(){
        last=null;
        length=0;
    }
    public void create(){
        listnode first=new listnode(1);
        listnode second=new listnode(2);
        listnode third=new listnode(3);
        listnode fourth=new listnode(4);
        listnode fifth=new listnode(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        last=fifth;
    }
    public void display(){
        if (last==null)
            return;
        listnode first=last.next;
        while(last!=first){
            System.out.println(" "+first.data+" ");
            first=first.next;
        }
        System.out.println(" "+first.data+" ");
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
    public static void main(String[] args){
        circularinsertfirst c=new circularinsertfirst();
        c.insertfirst(6);
        c.insertfirst(2);
        c.display();
    }
}
