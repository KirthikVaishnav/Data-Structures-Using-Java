import java.util.Scanner;
public class selection {
    public static void selsort(int[] a)
    {   int n=a.length;
        for (int i = 0; i <n-1; i++) {
            int min=i;        //initialising min to compare with other elements
            for(int j=i+1;j<n-1;j++)
            {
                if(a[i]>a[j])
                {
                    min=j;
                }
                            }
            int temp=a[i];            //swapping the values 
            a[i]=a[min];           
            a[min]=temp;
            System.out.println("i="+i); //printing array after each iteration
            printarr(a);
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
        int[] a={2,3,1,5,4}; //input array
        selsort(a);          //sorting function
        System.out.println("Sorted Array:");
        printarr(a);         
    }
}
