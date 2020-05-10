package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListt {
    public static void main(String[] args) {
        List<String> ll1 = new LinkedList<String>();
        ll1.add("BOLLA");ll1.add("BRO");
        System.out.println(ll1);

        //Linked List takes nearly equal time to insert or remove an object at any posiotion
        //but arraylist takes more time if that postion is not near to the last element

        for(int i=0;i<ll1.size();i++){
            ll1.get(i);
        }
    }
}