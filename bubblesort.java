import java.util.Scanner;
public class bubblesort {
    public static void bubsort(int[] a)
    {    int n=a.length;
        for (int i = 0; i <n-1; i++) {
            for(int j=i+1;j<n-i-1;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            printarr(a);
            System.out.println("i="+i);
        }
    }
    public static void printarr(int[] arr)
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]+"  ");
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int[] a={2,3,1,5,4};
        bubsort(a);
        System.out.println("Sorted Array:");
        printarr(a);
    }
}

