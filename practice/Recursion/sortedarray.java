package practice.Recursion;

public class sortedarray {
    public static boolean sortedarray(int arr[], int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]< arr[index+1]){
            return sortedarray(arr, index+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int index=0;
        System.out.println(sortedarray(arr, index));
    }
}
