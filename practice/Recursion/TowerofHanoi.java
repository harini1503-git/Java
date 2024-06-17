package practice.Recursion;

public class TowerofHanoi {

    public static void TowerofHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Transferred"+n +"disk from "+ source+ " to "+ destination);
            return;
        }
        TowerofHanoi(n-1, source, destination, helper);
        System.out.println("Transferred"+n +"disk from "+ source+ " to "+ destination);  //it means from source to destination (destination plays a role of helper)
        TowerofHanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n= 5;
        TowerofHanoi(n, "source", "helper", "destination");
    }
}
