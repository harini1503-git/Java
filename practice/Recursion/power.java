package practice.Recursion;

import java.util.Scanner;

public class power {
    public static int printpower(int x, int n){
        if(x==0){
            return 0;
        }else if(n==0){
            return 1;
        }
        x= x* printpower(x, n-1);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        System.out.println(printpower(x, n));
    }
}
