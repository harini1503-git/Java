import java.util.*;

public class repeatmissing {

    public static void repeatedandmissing(int num[], int n){
        Arrays.sort(num);
        int A=0;
        int B=0;
        for(int i=0; i<n; i++){
            if (i== n-1) {
                break;
            }
            if (num[i]== num[i+1]) {
                A= num[i];
            }
            if ((num[i]-num[i+1]!= 1)){
                B= i+1;
            }
        }
        System.out.println(A+ ", "+B);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        repeatedandmissing(num, n);
    }
}
