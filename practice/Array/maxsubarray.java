import java.util.*;

public class maxsubarray {

    public static int maxsubarray(int number[], int n){
        int maxsum= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum= sum+ number[j];
                if (maxsum< sum) {
                    maxsum=sum;
                }
            }
        }
        System.out.println("The subarray has the largest sum is "+maxsum);
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int number[]= new int[n];
        for(int i=0; i<number.length; i++){
            number[i]= sc.nextInt();
        }
        maxsubarray(number,n);
    }
}
