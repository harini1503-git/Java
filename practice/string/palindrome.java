package practice.string;
import java.util.*;

public class palindrome {
    public static void reverse(String str, int n){
        StringBuilder revBuilder= new StringBuilder();

        for(int i=n-1; i>=0; i--){
            revBuilder.append(str.charAt(i));
        }

        String reverseString= revBuilder.toString();

        if(str.compareTo(reverseString)==0){
            System.out.println("The given String is a palindrome Number.");
        }else{
            System.out.println("The given String is not a palindrome Number.");
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str= sc.nextLine();
        int n= str.length();
        
        reverse(str, n);
    }
}
