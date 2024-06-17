package practice.Recursion;

public class firstandlastoccurence {

    public static void firstandlastoccurence(String str, int index, char element, int first, int last){

        if(index== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar= str.charAt(index);
        if(currentchar== element){
            if(first==-1){
                first= index;
            }else{
                last=index;
            }
        }

        firstandlastoccurence(str, index+1, element, first, last);
    }
    public static void main(String[] args) {
        String str= "abaacdaefaah";
        int index=0;
        char element= 'b';
        int first=-1;
        int last=-1;
        firstandlastoccurence(str, index, element, first, last);
    }
}
