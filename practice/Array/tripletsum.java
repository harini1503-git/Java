import java.util.*;
public class tripletsum {
    public static void triplets(int num[], int n){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum= num[i]+num[j]+num[k];
                    if (sum== 0) {
                        System.out.println("The distinct triplets are: "+"["+num[i]+","+num[j]+","+num[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        triplets(num, n);
    }
}
