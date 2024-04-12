import java.util.*;
public class kthlargest {
    public static int kthlargestelement(int num[], int n, int k){
        Arrays.sort(num);
        int answer=0;
        for(int i=n-1; i>=k; i--){
            answer= num[n-k];
        }
        System.out.println("The Kth largest element in an array: "+answer);
        return answer;
    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        kthlargestelement(num, n, k);
        
    }
}
