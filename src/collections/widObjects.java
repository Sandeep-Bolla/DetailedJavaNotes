package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//To use objects of our own classses in a Set or Map... EQUALS and HASHCODE methods need to be implemented in it

class Person{
    int id;
    String name;

    Person(int id,String name){
        this.id =id;
        this.name = name;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    
    

}

public class widObjects {
    public static void main(String[] args) {
        Set<Person> s1 = new HashSet<>();
        s1.add(new Person(1,"Bolla")); s1.add(new Person(2,"Sandeep")); s1.add(new Person(1,"Bolla"));
        System.out.println(s1);
    }
}