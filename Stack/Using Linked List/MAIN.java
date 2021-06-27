public class MAIN {
    public static class node{
        int data;
        node next;
    }
    public static class stack{
        node top;
        public stack()
        {
            this.top=null;
        }
        public void push(int x)
        {
            node p=new node();
            p.data=x;
            p.next=top;
            top=p;
        }
        public boolean isEmpty()
        {
            return top==null;
        }
        public int peek()
        {
            if(!isEmpty()){
                return top.data;
            }
            else
            {
                System.out.println("Stack Empty!!!");
                return -1;
            }
        }
        public void pop()
        {
            top=top.next;
        }
    }
    public static void main(String[] args)
    {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
    }
}
