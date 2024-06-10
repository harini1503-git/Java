package practice.string;

import java.util.Scanner;

public class longestpalindormic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n= str.length();
        StringBuilder sb= new StringBuilder(str);
        String result= new String();
        
        for(int i=0; i<sb.length(); i++){
            int front= i;
            int back= sb.length()-1-i;

            char frontchar= sb.charAt(i);
            char backchar= sb.charAt(n-i-1);

            sb.setCharAt(frontchar, backchar);
            sb.setCharAt(backchar, frontchar);
            System.out.println(sb);

        }
        for(int j=0; j<n; j++){
            if(sb.charAt(j)== str.charAt(j)){
                result= result+ sb.substring(j, j+1);
            }
        }
        System.out.println(result);
    }
}
