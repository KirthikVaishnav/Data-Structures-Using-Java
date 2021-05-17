import java.util.Scanner;
public class linearsearch {
    public static void linsearch(int a[],int key)
    {
        int n=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {n=key;}
        }
        System.out.println("The key is found in index:"+n);
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int k;
        int ar[]={1,2,3,4,5,6,7};
        System.out.println("Given array:");
        printArray(ar);
        System.out.println("Enter the key:");
        k=obj.nextInt();
        linsearch(ar,k);
    }
}
