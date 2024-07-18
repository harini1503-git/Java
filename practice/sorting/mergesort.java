package practice.sorting;

public class mergesort {
    public static void conquer(int arr[], int si, int mid, int ei){
        int merge[]= new int[ei- si+1];   //ending index- starting index +1(because of length)
        int index1= si;
        int index2= mid+1;
        int mergeindex= 0;

        while(index1<= mid && index2 <= ei){
            if(arr[index1]<= arr[index2]){
                merge[mergeindex++]= arr[index1++];
            }else{
                merge[mergeindex++]= arr[index2++];
            }
        }
        while(index1<= mid){
            merge[mergeindex++]= arr[index1++];
        }
        while(index2 <= ei){
            merge[mergeindex++]= arr[index2++];
        }

        for(int i=0, j=si; i< merge.length; i++, j++){
            arr[j]= merge[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int mid= (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int n= arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
