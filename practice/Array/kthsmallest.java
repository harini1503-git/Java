import java.util.*;
public class kthsmallest {
    public static void kthsmallestelement(int num[], int n, int k){
        Arrays.sort(num);
        int answer=0;
        for(int i=0; i<=k; i++){
            answer= num[k-1];
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        kthsmallestelement(num, n, k);
    }
}
