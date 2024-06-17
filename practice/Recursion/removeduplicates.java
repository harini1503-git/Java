package practice.Recursion;

public class removeduplicates {
    public static boolean[] map= new boolean[26];

    public static void removeduplicates(String str, int index, String newString){
        if(index== str.length()){
            System.out.print(newString);
            return;
        }

        char currentchar= str.charAt(index);
        if(map[currentchar-'a']){
            removeduplicates(str, index+1, newString);
        }else{
            newString=newString+ currentchar;
            map[currentchar-'a']=true;
            removeduplicates(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str= "abbccda";
        int index= 0;
        String newString= "";
        removeduplicates(str, index, newString);
    }
}
