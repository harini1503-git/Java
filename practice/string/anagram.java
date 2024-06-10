package practice.string;
import java.util.*;
public class anagram {

    public static boolean  validanagram(char str1[], char str2[]){
        int n1= str1.length;
        int n2= str2.length;

        if(n1!= n2){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<n1; i++){
            if(str1[i]!= str2[i]){
                System.out.println("This string is not a anagram");
                return false;
            }
        }
        System.out.println("This string is a anagram.");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char str1[]= sc.nextLine().toCharArray();
        char str2[]= sc.nextLine().toCharArray();

        validanagram(str1, str2);
    }
}
