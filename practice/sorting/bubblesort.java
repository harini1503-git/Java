package practice.sorting;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2};
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    //swapping
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        
        System.out.println("Descending order: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println( arr[i]);
        }
        
    }
}
