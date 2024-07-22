package practice.ArrayList;
import java.util.ArrayList;
import java.util.Collections;+

public class concept {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element= list.get(2);
        System.out.println(element);

        //add element at its index
        list.add(0,6);
        System.out.println(list);

        //set element at a specific index
        list.set(2, 4);
        System.out.println(list);

        //delete element from an specific index
        list.remove(1);
        System.out.println(list);

        //size of an arraylist
        System.out.println(list.size());

        //loop/operations
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting an arrayList
        Collections.sort(list);
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i));
        }
    }
}
