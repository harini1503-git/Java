import java.util.*;
public class functions {
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Number!!");
            return;
        }
        int fact=1;
        for(int i=1; i<=n; i++){
            fact= fact* i;
        }
        System.out.println("Factorial of a Number is: "+fact);
        return;
    }
    public static void primeNo(int n){
        if(n<0){
            System.out.println("Invalid Number!!");
        }
        int i=2;
            if(n% i==0){
                System.out.println(n+ " :The given Number is not a prime Number.");
            }else{
                System.out.println(n+ " :The given Number is a prime Number.");
            }
        i++;
        return;
    }
    public static void evenodd(int n){
        if(n% 2==0){
            System.out.println("The Given Number is Even Number!!");
        }else{
            System.out.println("The Given Number is odd Number!!");
        }
    }
    public static void tables(int n){
        if(n<0){
            System.out.println("Invalid Number.");
        }
        for(int i=1; i<=10; i++){
            int multi= n*i;
            System.out.println(n+"*"+i+"="+multi);
        }
        return;
    }
    public static void avg(int a, int b, int c){
        int sum= (a+b+c)/3;
        System.out.println("Average of 3 numbers is: "+sum);
    }
    public static void sumofoddnumbers(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum= sum+i;
            }
        }
        System.out.println("The sum of all the odd numbers between the given numbers is: "+sum);
    }
    public static void greaternumber(int a, int b){
        if(a>b){
            System.out.println(a+" is Greater then "+b);
        }else if(b>a){
            System.out.println(b+" is Greater then "+a);
        }else{
            System.out.println(a+" is equal to "+b);
        }
        return;
    }
    public static void circumferenceofcircle(double r){
        double pi= 3.14;
        double circum= 2* pi* r;
        System.out.println("Circumference of a Circle is: "+ circum);
        return;
    }
    public static void eligiblevote(int age){
        if(age>18){
            System.out.println("You are eligible to vote!!");
        }else{
            System.out.println("You are not eligible to vote!!");
        }
        return;
    }
    public static void sumogposnegzero(int n){
        int pos=0, neg=0, zero=0;
        for(int i=0; i<=n; i++){
            if(i>0){
                pos=pos+1;
            }else if(i<0){
                neg= neg+1;
            }else{
                zero=zero+1;
            }
        }
        System.out.println("Total positive numbers: "+pos);
        System.out.println("Total negative numbers: "+neg);
        System.out.println("Total zero numbers: "+ zero);
    }
    public static void power(int x, int n){
        double pow= Math.pow(x, n);
        System.out.println("The Answer is: "+pow);
    }
    public static void greatestcommondivisor(int a, int b){
        int gcd=1;
        for(int num=2; num< a; num++){
            if(a%num==0 && b%num==0){
                gcd=num;
            }else{

            }
        }
        System.out.println("The Greatest common divisor is: "+ gcd);
    }
    public static void fibonacci(int n){
        int a=0; int b=1;int c;
        for(int i=1; i<=n; i++){
            if(i>2){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
            if(i==1){
                System.out.print(a+" ");
            }
            if(i==2){
                System.out.print(b+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        fibonacci(n);
    }
}
