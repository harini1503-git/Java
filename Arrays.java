import java.util.Scanner;

public class Arrays {
    public static void marks(){
        int marks[]= new int[4];
        marks[0]=93;
        marks[1]=90;
        marks[2]=78;
        marks[3]=84;
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    public static void numbers(int size){
        Scanner sc= new Scanner(System.in);
        int number[]= new int[size];
        //user input
        for(int i=0; i<number.length; i++){
            number[i]=sc.nextInt();
        }
        //output
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
    public static void numbers2(int x){
        Scanner sc= new Scanner(System.in);
        int search[]= new int[5];
        //input
        for(int i=0; i<search.length; i++){
            search[i]=sc.nextInt();
            System.out.println("Enter the number: "+ search[i]+" ");
        }
        System.out.println("The number you want to search: "+ x);

        for(int i=0; i<5; i++){
            if(search[i]== x){
                System.out.println("The given number is in the index number: "+ i);
            }
        }
    }
    public static void numbers3(){
        Scanner sc= new Scanner(System.in);
        String names[]= new String[6];
        //input:
        for(int i=0; i< names.length; i++){
            names[i]= sc.nextLine();
        }
        //output:
        for(int i=0; i< names.length; i++){
            System.out.print(names[i]+", ");
        }
    }
    public static void numbers4(){
        Scanner sc= new Scanner(System.in);
        int numbers[]= new int[5];
        for(int i=0; i<5; i++){
            numbers[i]=sc.nextInt();
        }
        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        for(int i=0; i<5; i++){
            if(numbers[i]<=max){
                max= numbers[i];
            }
            if(numbers[i]>= min){
                min= numbers[i];
            }
        }
        System.out.println("The largest number is: "+ min);
        System.out.println("The smallest number is: "+ max);
    }
    public static void numbers5(int size){
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[size];
        int temp = 0;

        // Display elements of the original array
        System.out.println("Elements of the original array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        // Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(); // New line
        // Display elements of the array after sorting
        System.out.println("Elements of the array sorted in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void numbers6(){
        Scanner sc= new Scanner(System.in);
        //2D arrays
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int numbers[][]= new int[rows][cols];
        // for input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println();
        int x= sc.nextInt();
        //output:
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j]== x){
                    System.out.println("index of the row: "+ i);
                    System.out.println("index of the column: "+ j);
                }
            }
        }
    }
    public static void numbers7(int size){
        Scanner sc= new Scanner(System.in);
        int[] numbers= new int[size];
        for(int i=0; i< numbers.length; i++){
            numbers[i]= sc.nextInt();
        }
        int max= numbers[0];
        int min= numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]> max){
                max= numbers[i];
            }else if(numbers[i]< min){
                min= numbers[i];
            }
        }
        System.out.println("The largest Number is: "+ max);
        System.out.println("The smallest number is: "+ min);
    }
    public static void ascending(int[] arr){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]> arr[j]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    System.out.print(arr[i]+",");
                }else{
                    System.out.print(arr[j]);
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        //int x= sc.nextInt();
        int arr[]= new int[size];
        ascending(arr);
    }
}
