import java.util.*;

public class rotatedsortarray {

    public static int rotated(int num[], int n, int target){
        for(int i=0; i<n; i++){
            if (num[i]== target) {
                System.out.println("your number is found in the index number: "+ i);
            }
        }
        System.out.println("-1");
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        rotated(num, n, target);
    }
}
