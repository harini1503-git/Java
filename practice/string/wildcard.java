package practice.string;

public class wildcard {
    public static void main(String args[]){
        String str= "ha?ri*?ni";  //'?' replace 'e' and '*' replace 'forgeeks'
        System.out.println(str);
        String newString= "";
        for(int i=0; i<str.length(); i++){
            char currentchar= str.charAt(i);
            if (currentchar== '?') {
                newString= newString+ 'e';
            }else if(currentchar== '*'){
                newString= newString+ "forgeeks";
            }else{
                newString= newString+ currentchar;
            }
        }
        System.out.println(newString);
    }
}
