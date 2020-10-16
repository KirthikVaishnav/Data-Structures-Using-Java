import java.util.Scanner;

public class insertion {
    public static void inssort(int[] a)
    {   int n=a.length;
        for (int i = 0; i <n; i++) {
                int key=a[i];
                int j=i-1;
                while(j>=0 && a[j]>key)
                {
                    a[j+1]=a[j];
                    j=j-1;
                }
                a[j+1]=key;
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
        inssort(a);
        System.out.println("Sorted Array:");
        printarr(a);
    }

}
