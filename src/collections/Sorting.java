package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//we can sort only List<T> with cCollections.sort()

class RevSortIntList implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}

// class PersonExtra extends Person{

// } 

public class Sorting {
    public static void main(String[] args) {

        //Sorting a list of Strings
        List<String> l1 = new ArrayList<>();
        l1.add("Sandeep");l1.add("Bolla");l1.add("Sampath");
        System.out.println(l1);

        Collections.sort(l1);//sorting using natural ordering
        System.out.println(l1);

        Collections.sort(l1,new Comparator<String>() { //Sorting in reverseorder using anonymous classes
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(l1);

        //Sorting a list of integers
        List<Integer> l2 = new ArrayList<>();
        l2.add(5);l2.add(2);l2.add(7);l2.add(30);l2.add(5);
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);
        Collections.sort(l2, new RevSortIntList());
        System.out.println(l2);

        //List<Integer> l6 = Collections.emptyList(); returns an empty list

        //Sorting a list of Objects of a Custom class
        
        List<Person> l3 = new ArrayList<>(); //Person class is in WidObjects.java
        l3.add(new Person(1,"Sampath"));l3.add(new Person(5,"Sandeep"));l3.add(new Person(2,"Bolla"));
        System.out.println(l3);
        Collections.sort(l3,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) { //sorting in ascending order based on the IDs 
                //return ((Integer)o1.getId()).compareTo(o2.getId());
                if(o1.getId()<o2.getId()) return -1; //canbe implented using compareTo also as shown in aobve line
                else return 1;
            }
        });
        System.out.println(l3);

        Collections.sort(l3,new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) { //sorting in ascending order based on the NAMEs 
            return (o1.getName()).compareTo(o2.getName());
        }
    });
    System.out.println(l3);

    }
}