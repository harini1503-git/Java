package practice.string;

import java.util.*;

public class validparentheses {

    public static void parentheses(char str[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(str[i]== '(' && str[j]== ')'){
                    System.out.println("This is a valid parentheses.");
                }else if(str[i]== '[' && str[j]== ']'){
                    System.out.println("This is a valid parentheses.");
                }else if(str[i]== '{' && str[j]== '}'){
                    System.out.println("This is a valid parentheses.");
                }else{
                    System.out.println("This is not a valid parentheses.");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char str[]= sc.nextLine().toCharArray();
        int n= str.length;

        parentheses(str, n);
    }
}
