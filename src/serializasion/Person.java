package serializasion;

import java.io.Serializable;

public class Person implements Serializable {
    //To serilaize data it is mandatory ot implement Serializable interface

    private static final long serialVersionUID = 7075429499682627509L;
    //This is optional but this UID is very much needed in practical application of serialisation

    /*This UID is very much useful...
    if a line is written into a bin file and after somedays ...as we change the code of the classes in the project
    and we change the UID too if the class has changed a lot too. So that now, if someone read the from the file with this new UID...It gives an error
    As it's not matched with the UID of the writing time.
    ie.. it gives a checking if u r reading with the same class that u wrote with 
    */
    transient int id; //To make something non-serializable we can use TRANSIENT keyword
    //now it wont update the value of ID... it just prints 0(the default value in java)
    String name;

    //static fields are not serialized because they are not for objects, so only a default value is stored(ie. 0 for an int)

    Person(int id, String name){
        this.id = id;
        this.name = name; 
    }
    
    @Override
    public String toString() {
        return "ID: "+id+"  Name: "+name;
    }
}

class Testing{
    public static void main(String[] args) {
        System.out.println(new Person(1,"Bolla"));
    }
}