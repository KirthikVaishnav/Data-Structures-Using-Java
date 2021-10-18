public class implementdblist {
    public ListNode head;
    public ListNode tail;
    public int length;
    public class ListNode{
        int data;
        ListNode prev;
        ListNode next;
        public ListNode(int d)
        {
            this.data=d;
        }
    }
    public Doublylinkedlist()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public int length(){
        return length;
    }
}
