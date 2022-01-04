public class circulartraversal {
    private ListNode last;
    private int length;
    public class ListNode{
        public ListNode next;
        public int data;
        public ListNode(int data){
            this.data=data;
        }
    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public circulartraversal(){
        last=null;
        length=0;
    }
    public void create(){
        ListNode first=new ListNode(1);
        ListNode second = new ListNode(21);
        ListNode third = new ListNode(22);
        ListNode fourth = new ListNode(23);
        ListNode fifth = new ListNode(24);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;
        last = fifth;
    }
    public void display(){
        if(last==null)
            return;
        ListNode first=last.next;
        while(last!=first){
            System.out.println(" "+first.data+" ");
            first=first.next;
        }
        System.out.println(" "+first.data+" ");
    }
    public static void main(String[] args)
    {
        circulartraversal c=new circulartraversal();
        c.create();
        c.display();
    }
}

