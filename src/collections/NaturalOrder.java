package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

//Natural Order is implemented by TreeSet and TreeMap and collection.sort() defaultly
//For a Natural Order to be implemented by the Set of objects of our won class, *Comparable* interface need to be implemented thereby its inherited methods 
//Similarly for a TreeMap as it is just like a sorting of set of Keys

class PersonEx extends Person implements Comparable<Person>{

    

    PersonEx(int id, String name) {
        super(id, name); //super() is used to call constructors of parent class
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
    
}

public class NaturalOrder {
    public static void main(String[] args) {
        List<PersonEx> l1 = new ArrayList<>();
        SortedSet<PersonEx> s1 = new TreeSet<>(); //Sorted Set is an interface implemented by TreeSet
        //Declared as SortedSet only to diffrentiate it from normal set

        addElem(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1+"\n");

        addElem(s1);
        System.out.println(s1);

    }

    public static void addElem(Collection<PersonEx> col){
        col.add(new PersonEx(1,"Bolla"));
        col.add(new PersonEx(3,"Sandeep"));
        col.add(new PersonEx(4,"Sampath"));
        col.add(new PersonEx(2,"Sai"));
    }
}