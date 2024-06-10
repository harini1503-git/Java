package practice.string;

import java.util.*;

public class removeconsecutives {

    public static void removeconsecutive(String n){
        StringBuilder sb= new StringBuilder(n);
        
        for(int i=0; i<sb.length()-1; i++){
            if(sb.charAt(i)== sb.charAt(i+1)){
                sb.delete(i, i+1);
            }
        }
        System.out.println("By removing consecutive i got this result: "+ sb);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();

        removeconsecutive(n);
    }
}
