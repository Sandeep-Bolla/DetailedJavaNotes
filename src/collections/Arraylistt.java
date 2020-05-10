package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylistt {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(3);//even for non primitive types... need to write its primitive name in the template
        al1.add(3);al1.add(5);al1.add(7);

        //Iteration #1 - using indexes
        for(int i=0;i<al1.size();i++){
            System.out.println(al1.get(i));
        }

        //Iteration #2
        for(Integer i:al1){
            System.out.println(i);
        }

        //All the List classes are implemented with List interface

        //List interface
        List<String> l1 = new ArrayList<>();
        System.out.println(l1);
    }
}