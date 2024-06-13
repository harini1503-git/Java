package practice.sorting;

public class selectionsort {
    public static void main(String[] args) {

        //selection sorting algorithm
        System.out.println("Selection sort:- ");
        System.out.println("Ascending order:- ");
        int arr[]= {7,8,3,1,2};
        for(int i=0; i<arr.length-1; i++){
            int smallest=i; 
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]> arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[smallest];
            arr[smallest]= arr[i];
            arr[i]= temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Descending order");
        for(int j=arr.length-1; j>=0; j--){
            System.out.println(arr[j]);
        }
    }
}
