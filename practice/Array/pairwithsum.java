
import java.util.*;
public class pairwithsum {
    public static void pairwithsum(int num[], int n, int x){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sum= num[i]+num[j];
                if (sum== x) {
                    System.out.println("There is a pair " +"("+num[i]+","+ num[j]+")"+ " with sum "+ x);
                    System.out.println("true");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0 ;i<n; i++){
            num[i]= sc.nextInt();
        }
        int x= sc.nextInt();
        pairwithsum(num, n, x);
    }
}
