public class mergesort {
    public static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1]; //creating new array to store the left and right elements
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];      //storing the left elements
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];  //storing the right elements
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {   //combining and arranging the left and right array in a sorted order
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;      //finding midpoit of array
            sort(arr, l, m);          //divide method   
            sort(arr, m + 1, r);
            merge(arr, l, m, r);     //conquer method
        }
    }

    public static void printArray(int arr[]) {       //function is print array
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};//input array
        System.out.println("Given Array");
        printArray(arr);
        sort(arr, 0, arr.length - 1); //sorting function
        System.out.println("\nSorted array");
        printArray(arr);//printing sorted array
    }
}
