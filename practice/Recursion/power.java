package practice.Recursion;

import java.util.Scanner;

public class power {
    public static int printpower(int x, int n){
        if(x==0){
            return 0;
        }else if(n==0){
            return 1;
        }
        //for height of the stack is log n
        if (n%2== 0) {
            return printpower(x, n/2) * printpower(x, n/2);
        }else{
            return printpower(x, n/2)* printpower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        System.out.println(printpower(x, n));
    }
}
