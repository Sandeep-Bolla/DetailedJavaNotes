package learn2;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);l1.add(3); //Adds inegers at the end
        l1.add(0, 1); //Adds 1 at index 0
        System.out.println(l1);
        System.out.println(l1.get(0));

        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1, "Sandeep");
        m1.putIfAbsent(1, "Sampath");
        m1.put(1, "Bolla");
        m1.put(2,"Sai");
        System.out.println(m1);
        System.out.println(m1.get(1));
    }
}