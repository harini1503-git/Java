import java.util.*;
public class trappingwater {
    public static int trappingrainwater(int num[], int n){
        int res=0;
        int min=0; 
        for(int i=1; i<n-1; i++){
            int left= num[i];
            for(int j=0; j<i; j++){
                if (num[j]> left) {
                    left= num[j];
                }
            }
            int right= num[i];
            for(int j=i+1; j<n; j++){
                if (num[j]> right) {
                    right= num[j];
                }
            }
            
            if (left< right) {
                min= left;
            }else if (right< left) {
                min= right;
            }

            res= res+ min- num[i];
        }
        System.out.println("Output: "+res);
        return res;
    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        trappingrainwater(num, n);
    }
}
