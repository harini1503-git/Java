import java.util.*;
public class minmergeopforpalindrome {
    public static int arraypalindrome(int num[], int n){
        int i=0;
        int j=n-1;
        int count=0;
        while (i<j) {
            if (num[i]<num[j]) {
                num[i+1]=num[i+1]+num[i];
                i++;
                count++;
            }else if (num[i]> num[j]) {
                num[j-1]= num[j-1]+num[j];
                j--;
                count++;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("Total merging operations performed are: "+ count);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        arraypalindrome(num, n);
    }
}
