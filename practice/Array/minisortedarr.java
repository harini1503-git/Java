import java.util.*;
public class minisortedarr {
    public static void minimumrotatedsortedarray(int num[], int n){
        int low= 0;
        int high= n-1;
        int min= Integer.MAX_VALUE;
        while (low<high) {
            int mid= (low+high)/2;
            if (num[low]<= num[mid]) {
                min= num[low];
                low= mid+1;
            }else{
                min= num[high];
                high= mid+1;
            }
        }
        System.out.println("Output: "+min);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        minimumrotatedsortedarray(num, n);
    }
}
