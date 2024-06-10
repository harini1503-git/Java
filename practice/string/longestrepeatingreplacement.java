package practice.string;

import java.util.Scanner;

public class longestrepeatingreplacement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Text: ");
        String str= sc.nextLine();
        System.out.println("Enter the key value: ");
        int k= sc.nextInt();
        int n= str.length();

        for(int i=0; i<n; i++){
            int replacement=0;
            while(replacement<=k && str.charAt(i)== str.charAt(i+1)){
                char r= str.charAt(i+1);
                if(r== 'B'){
                    r= 'A';
                }else if(r== 'A'){
                    r= 'B';
                }else{

                }
            }
            for(int j=i+1; j<=n; j++){
                int max= -1;
                if(str.charAt(i)== str.charAt(j)){
                    String subs=str.substring(i,j);
                    int len= subs.length();
                    if(max< len){
                        max= len;
                    }
                }
                System.out.println("Substring is: "+ max);
            }
        }
        
    }
}
