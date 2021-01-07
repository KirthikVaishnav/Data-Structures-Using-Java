public class naive {
    public static void naivep(int arr[],int l,int h,int p) {
        int[] temp = new int[h-l + 1];
        int ind = 0;
        for (int i = l; i <= h; i++) {            //store smaller and equal value
            if (arr[i] <= arr[p]) {
                temp[ind] = arr[i];
                ind++;
            }
        }
        for (int i = l; i <= h; i++) {            //store greater value
            if (arr[i] > arr[p]) {
                temp[ind] = arr[i];
                ind++;
            }
        }
        for (int i = l; i <= h; i++)             //copy to original array
            arr[i] = temp[i-l];

    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int a[]=new int[]{2,1,5,3,6,7,4};
        System.out.println("Given array:");
        printArray(a);
        naivep(a,0,a.length,a.length);
        System.out.println("Partioned array:");
        printArray(a);
    }
}
