package practice.string;

import java.util.Arrays;
import java.util.Scanner;

public class duplicates {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char chars[]= str.toCharArray();
        Arrays.sort(chars);
        String sortedstr= new String(chars);
        int n= str.length();
        for(int i=0; i<n; i++){
                int count=1;
                while(i<n-1 && sortedstr.charAt(i)== sortedstr.charAt(i+1)){
                    count++;
                    i++;
                }
            System.out.println(str.charAt(i)+" Count is: "+count);
        }
    }
}
