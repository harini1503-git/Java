package practice.string;

public class panagram {

    public static boolean ispanagram(String str){
        if(str.length()<26){
            System.err.println("the given string is not a panagram");
            return false;
        }else{
            for(char ch='a'; ch<='z'; ch++){
                if(str.indexOf(ch)<0){
                    System.out.println("The given string is not a panagram");
                    return false;
                }
            }
        }
        System.out.println("the given string is a panagram");
        return true;
    }
    public static void main(String[] args) {
        String str= "my name is harini mudaliar ravi";

        ispanagram(str);
    }
}
