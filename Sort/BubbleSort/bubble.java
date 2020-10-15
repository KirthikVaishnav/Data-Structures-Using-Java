import java.util.Scanner;

public class bubble {
    public static void bubsort(int[] a)
    {
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=a[j];
                }
            }
            System.out.println("Sort after i="+ i+1);
            printarr(a);
        }
    }
    public static void printarr(int[] a)
    {
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int[] a=new int[20];
        int n;
        System.out.println("Enter array size:");
        n=obj.nextInt();
        System.out.println("Enter array elements");
        for (int i = 0; i <n; i++)
        {
            a[i]=obj.nextInt();
        }
        bubsort(a);
        printarr(a);
    }
}
