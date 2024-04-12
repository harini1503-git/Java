import java.util.*;

public class chocolateproblem {

    public static int choco(int num[], int n, int m){
        int min= Integer.MAX_VALUE;
        Arrays.sort(num);
        for(int i=0; i<n; i++){
            int diff= num[i+m-1]-num[i];
            if (diff<min) {
                min= diff;
                System.out.println("The minimum difference between maximum and minimum number is: "+ min);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        choco(num, n, m);
    }
}