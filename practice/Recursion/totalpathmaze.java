package practice.Recursion;

public class totalpathmaze {
    public static int totalpathmaze(int i, int j, int n, int m){

        if(i==n || j==m){
            return 0;
        }
        if(i== n-1 && j== m-1){
            return 1;
        }

        int downwards= totalpathmaze(i+1, j, n, m);
        int rightside= totalpathmaze(i, j+1, n, m);
        return downwards+rightside;

    }
    public static void main(String[] args) {
        int n=3, m=3;
        int i=0, j=0;
        System.out.print(totalpathmaze(i, j, n, m));
    }
}
