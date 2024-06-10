import java.util.*;
public class arragementobiggest {
    public static void biggestnumber(int num[], int n){
        

        String str1= "";
        for(int i=0; i<n; i++){
            String str2= Integer.toString(num[i]);
            String str3= Integer.toString(num[i+1]);
            
            String concateString1= str2+str3;
            String concateString2= str3+str2;

            int integer1= Integer.parseInt(concateString1);
            int integer2= Integer.parseInt(concateString2);

            if(integer1 > integer2){
                str1= str1+ concateString1;
            }else if(integer2 > integer1){
                str1= str1+ concateString2;
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]= new int[n];
        for(int i=0; i<n; i++){
            num[i]= sc.nextInt();
        }
        biggestnumber(num, n);
    }
}
