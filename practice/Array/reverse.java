
import java.util.*;

public class reverse {

    public static void reversearray(int num[], int n){
        int i=0;
        int j= n-1;
        while (i<j) {
            int temp= num[i];
            num[i]= num[j];
            num[j]= temp;
            i++;
            j--;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int number[]= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i< number.length; i++){
            number[i]= sc.nextInt();
        }

        reversearray(number, number.length);
        printArray(number);
    }
}
