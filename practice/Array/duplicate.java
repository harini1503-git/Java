import java.util.*;

public class duplicate {

    public static boolean containsduplicate(int num[], int n){
        for(int i=0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if (num[i]== num[j]) {
                    System.out.println("True");
                    return true;
                }
            }
        }
        System.out.println("False");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        containsduplicate(num, n);
    }
}
