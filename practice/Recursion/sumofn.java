package practice.Recursion;

import java.util.Scanner;

public class sumofn {
    public static void printSum(int i, int n, int sum){
        if(i== n){
            sum+= i;
            System.out.println(sum);
            return;
        }

        sum+= i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        printSum(1, n, sum);

    }
}
