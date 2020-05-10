package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Advntage of iterator is we can remove elements while iterating which is not possible in for loop
//with ListIterator, we can even add elements while iterating.


public class Iteratorz {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("Fox");l1.add("Cat");l1.add("Crow");l1.add("Pandi");
        
        Iterator<String> it = l1.iterator(); //creating an iterator
        while(it.hasNext()){ //checks if list has next elements
            String val = it.next();
            System.out.println(val); //returns next element

            if(val.equals("Cat")){
                it.remove(); //removes the element that the iterator is pointing to
            }
        }

        System.out.println();

        for(String val:l1) {
            System.out.println(val);
        }

        ListIterator<String> it2 = l1.listIterator();
        while(it2.hasNext()){
            if(it2.next().equals("Cat")){
                it2.add("Tiger"); //an element is added
            }
        }
        //To check more aobut Listiterator Refer: https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
    }
}