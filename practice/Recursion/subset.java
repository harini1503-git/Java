package practice.Recursion;

import java.util.ArrayList;

public class subset {
    public static void subset(int n, ArrayList<Integer> subsetArrayList){
        if(n==0){
            System.out.println(subsetArrayList);
            return;
        }

        subsetArrayList.add(n);
        subset(n-1,subsetArrayList);

        subsetArrayList.remove(subsetArrayList.size()-1);
        subset(n-1,subsetArrayList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> subsetArrayList= new ArrayList<>();
        subset(3, subsetArrayList);
    }
}
