import java.util.Scanner;

public class binarysearch {
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static int binsearch(int[] arr, int key,int s)
    {
        int low=0;
        int high=s-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            { return 1;}
            else if(arr[mid]<key)
            { low=mid+1;}
            else
            { high=mid-1;}
        }
        
        return -1;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int k;
        int size;
        int ar[]={1,2,3,4,5,6,7};
        System.out.println("Given array:");
        printArray(ar);
        size=ar.length;
        System.out.println("Enter the key:");
        k=obj.nextInt();
        binsearch(ar,k,size);
    }
}
