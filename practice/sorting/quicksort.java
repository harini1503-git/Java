package practice.sorting;

public class quicksort {
    public static int partition(int arr[], int low, int high){
        int i= (low-1);
        for(int j=low; j<high; j++){
            if(arr[j]<= arr[high]){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]= arr[high];
        arr[high]= temp;
        return i;
    }
    public static void quicksort(int arr[], int low, int high){
        if(low <high){
            int pivotindex= partition(arr, low,high);
            quicksort(arr, low, pivotindex-1);
            quicksort(arr, pivotindex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int n= arr.length;
        
        quicksort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
