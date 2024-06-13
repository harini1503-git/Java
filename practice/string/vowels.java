package practice.string;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int n= str.length();
        char ch[]= str.toCharArray();
        int count= 0;

        for(int i=0; i<n; i++){
            switch (ch[i]) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
