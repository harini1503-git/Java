package practice.Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.print(a);
        fibonacci(b, b+a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        fibonacci(0, 1, n);
        
    }
}
