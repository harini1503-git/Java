package practice.string;

import java.util.Scanner;

public class longestpalindormic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n= str.length();
        String reverse= new String();
        String result= new String();
        
        for(int i= str.length()-1; i>=0; i--){
            reverse= reverse+ str.charAt(i);
        }
        for(int j=0; j<n; j++){
            if(reverse.charAt(j)== str.charAt(j)){
                result= result+ reverse.substring(j, j+1);
            }
        }
        System.out.println(result);
    }
}
