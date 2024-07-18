package practice.Recursion;

public class party {
    public static int partyinvite(int n){
        if(n<=1){
            return 1;
        }

        int single= partyinvite(n-1);   //3  2
        int pair= (n-1)* partyinvite(n-2);  //3 * 2=6  2*1=2 
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(partyinvite(6));
        
    }
}
