import java.util.*;
import java.io.*;
public class containerwithmostwater {
    public static void container(int num[], int n){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (i<j) {
                    int width= j-i;
                    int min= Math.min(num[i], num[j]);
                    int product= width* min;
                    if (max< product) {
                        max= product;
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        container(num, n);
    }
}
