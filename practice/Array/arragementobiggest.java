import java.util.*;
public class arragementobiggest {
    public static void biggestnumber(int num[], int n){
        
        long number=0;
        Arrays.sort(num);

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                String str1= Integer.toString(num[i]);
                String str2= Integer.toString(num[j]);
                String str3String= str1+ str2;
                String str4String= str2+str1;

                int concatenumber1= Integer.parseInt(str3String);
                int concatenumber2= Integer.parseInt(str4String);

                String numString= Long.toString(number);

                if (concatenumber1< concatenumber2) {
                    numString= numString+ str3String;
                    number= Long.parseLong(numString);
                    System.out.println(number);
                }else if (concatenumber2< concatenumber1) {
                    numString= numString+ str4String;
                    number= Integer.parseInt(numString);
                    System.out.println(number);
                }
            }
        }
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
