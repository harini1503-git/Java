package practice.Recursion;

import java.util.HashSet;

public class subsequences {
    public static void subsequences(String str, int index, String newString, HashSet<String> set){
        if(index== str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentchar= str.charAt(index);
        subsequences(str, index+1, newString+ currentchar, set);

        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str= "aaa";
        int index= 0;
        String newString= "";
        HashSet<String> set= new HashSet<>();
        subsequences(str, index, newString, set);
    }
}
