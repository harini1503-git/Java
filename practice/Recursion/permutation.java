package practice.Recursion;

public class permutation {
    public static void permutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            char currentchar= str.charAt(i);
            String newString= str.substring(0,i)+ str.substring(i+1);
            permutation(newString, permutation+ currentchar);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        String permutation= "";
        permutation(str, permutation);
    }
}
