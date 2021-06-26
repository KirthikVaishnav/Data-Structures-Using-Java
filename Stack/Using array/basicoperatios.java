public class basicoperations{
    int arr[]=new int[5];
    int top=0;
    public void push(int data)
    {
        arr[top]=data;
        top++;
    }
    public int pop()
    {
        int data;
        top--;
        data=arr[top];
        arr[top]=0;
        return data;
    }
    public int peek()
    {
        int data;
        data=arr[top-1];
        return data;
    }
    public void show()
    {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
