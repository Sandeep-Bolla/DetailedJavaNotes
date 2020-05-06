package learn2;

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    //We can override hashcode method to get our own hashcode for an object
    // @Override
    // public int hashCode() {
    //     return 111;
    // }
}

public class Equals {
    public static void main(String[] args) {
        /*
         * General: "==" operator will return true only if two object reference it is
         * comparing represent exactly same object The .equals() method compares the
         * values
         */
        Person p1 = new Person(5, "Sandeep");
        Person p2 = new Person(5, "Sandeep");
        System.out.println(p1);System.out.println(p2); //returns unqiue hashCode for all the objects
        System.out.println(p1 == p2); // return false
        p1 = p2;
        System.out.println(p1 == p2); //return true

        // To compare the values we use equals() method

        System.out.println(p1.equals(p2)); //return true
        
        /*
         * int is a primitive data type that two stores an integer, Integer is a wrapper
         * class which wraps a primitive type int into an object. Similarly for others
         */

        // For primitive data types == compares values giving the needed answer. Since
        // they cant have equals() method
        int n1 = 5;
        int n2 = 5;
        System.out.println(n1 == n2); // gives true

        Integer c1 = 5;
        Integer c2 = 6;
        c2--;
        System.out.println(c1 == c2); // gives true
        System.out.println(c1.equals(c2)); // gives true

        double d1 = 2.33;
        double d2 = 2.33;
        System.out.println(d1 == d2);// returns true
        Double D1 = 2.33;
        Double D2 = 2.33;
        System.out.println(D1 == D2);// returns false
        //Wrapper classes Double and Float are exceptions to the above statememt that's valid for primitive data-type where their reference is compared instead of values.

        String s1 = "Hello"; String s2 = "Hello"; System.out.println(s1==s2); //should return false but returns true
        //Java might optimize sometimes to point two different references to the same object when they are initialized with same value
        //That can be the reason behind... Y == returning true?
        String s11 = "Hello"; String s21 = "HelloMaster".substring(0, 5); System.out.println(s11==s21); //returns false
        System.out.println(s21); //Both values are Hello now
        System.out.println(s11.equals(s21)); //returns true
        

    }
}