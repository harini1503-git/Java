
import java.util.*;

public class maxmin {
    public static void main(String args[]){
        int number[]= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i< number.length; i++){
            number[i]=sc.nextInt();
        }
        int max= number[0];
        int min= number[0];

        for(int i=0; i<number.length; i++){
            if (number[i]> max) {
                max= number[i];
            }else if (number[i]<min) {
                min= number[i];
            }
        }

        System.out.println("The Maximum Number is: "+ max);
        System.out.println("The Minimum Number is: "+ min);
    }
}
