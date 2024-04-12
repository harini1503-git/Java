import java.util.*;
public class buysell {

    public static int buyselltime(int num[], int n){
        int min= Integer.MAX_VALUE;
        int profit= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if (min > num[i]) {
                min= num[i];
            }else if (profit< num[i]-min) {
                profit= num[i]- min;
            }
        }
        System.out.println("Maximum possible profit: "+profit);
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        buyselltime(num, n);
    }
}
