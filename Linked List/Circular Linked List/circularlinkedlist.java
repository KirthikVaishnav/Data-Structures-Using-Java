public class circularlinkedlist {
    private ListNode last;
    private int length;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public circularlinkedlist() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void create() {
        ListNode first = new ListNode(2);
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
    
    public static void main(String[] args) {
        circularlinkedlist c = new circularlinkedlist();
        c.create();
    }
}
