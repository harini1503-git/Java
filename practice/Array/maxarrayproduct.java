import java.util.*;
public class maxarrayproduct {
    public static int maxproduct(int num[], int n){
        int max=0;
        for(int i=0; i<n-1; i++){
            int product= num[i]*num[i+1];
            if(product> max){
                max=product;
            }
        }
        System.out.println("Largest product is:  "+ max);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        maxproduct(num, n);
    }
}
