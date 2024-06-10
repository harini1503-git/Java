package practice.string;

import java.util.Scanner;

public class convertsentence {

    public static void mobilekeypad(String str[], String str1){
        String output= "";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==' '){
                output= output+"0";
            }else if(str1.charAt(i)=='A' || str1.charAt(i)=='B'|| str1.charAt(i)=='C'|| str1.charAt(i)=='D' || str1.charAt(i)=='E'|| str1.charAt(i)=='F'||
            str1.charAt(i)=='G'|| str1.charAt(i)=='H'|| str1.charAt(i)=='I'|| str1.charAt(i)=='J'|| str1.charAt(i)=='K'|| str1.charAt(i)=='L'|| str1.charAt(i)=='M'||
            str1.charAt(i)=='N'|| str1.charAt(i)=='O'|| str1.charAt(i)=='P'|| str1.charAt(i)=='Q'|| str1.charAt(i)=='R'|| str1.charAt(i)=='S'|| str1.charAt(i)=='U'||
            str1.charAt(i)=='V'|| str1.charAt(i)=='W'|| str1.charAt(i)=='X'|| str1.charAt(i)=='Y'|| str1.charAt(i)=='Z'){
                int position= str1.charAt(i)-'A';
                output= output+ str[position];
            }else{
                int position= str1.charAt(i)-'a';
                output= output+ str[position];
            }
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str[]= {"2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888","9", "99", "999", "9999"};
        String str1= sc.nextLine();
        mobilekeypad(str, str1);
    }
}
