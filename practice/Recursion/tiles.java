package practice.Recursion;

public class tiles {
    public static int tiles(int n, int m){
        if(n== m){
            return 2; // one is fully vertical or one is fully horizontal
        }
        if(n< m){
            return 1; //horizontal
        }


        int vertical= tiles(n-m, m);   
        int horizontal= tiles(n-1, m); 
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4, 2));
    }
}
