package practice.Recursion;

public class keypad {
    public static String[] keypad= {".", "abc","def", "ghi", "jkl", "mno","pqrs", "tu", "vwz", "yz"};

    public static void keypad(String str, int index, String combination){
        if(index== str.length()){
            System.out.println(combination);
            return;
        }

        char currentchar= str.charAt(index);
        String mapping= keypad[currentchar-'0'];
        for(int i=0; i<mapping.length(); i++){
            keypad(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        int index=0;
        String combination= "";
        keypad(str, index, combination);
    }
}
