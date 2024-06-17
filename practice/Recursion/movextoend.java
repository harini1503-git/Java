package practice.Recursion;

public class movextoend {
    public static void moveallxtoend(String str, int index, int count, String newString){
        
        if(index== str.length()){
            for(int i=0; i< count; i++){
                newString= newString+ 'x';
            }
            System.out.print(newString);
            return;
        }
        char currentchar= str.charAt(index);
        if(currentchar=='x'){
            count++;
            moveallxtoend(str, index+1, count, newString);
        }else{
            newString= newString+ currentchar;
            moveallxtoend(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str= "axbcxxd";
        int index= 0;
        int count=0;
        String newString= "";
        moveallxtoend(str, index, count, newString);
    }
}
