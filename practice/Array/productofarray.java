import java.util.*;

public class productofarray {

    public static void productofarrayexceptitself(int num[], int n){
        int left[]= new int[n];
        int right[]=new int[n];
        int ans[]= new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        Arrays.fill(ans, 1);
        for(int i=1; i<n; i++){
            left[i]= left[i-1]* num[i-1];
        }
        for(int i=n-2; i>=0; i--){
            right[i]= right[i+1]*num[i+1];
        }
        for(int i=0; i<n; i++){
            ans[i]= left[i]*right[i];
        }
        System.out.println(Arrays.toString(ans));
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        productofarrayexceptitself(num, n);
    }
}
