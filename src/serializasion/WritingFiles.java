package serializasion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WritingFiles {
    public static void main(String[] args) {
        try (FileOutputStream fo = new FileOutputStream("test1.bin")) {
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            Person p1 = new Person(1,"Sandeep Bolla");
            oo.writeObject(p1);
            oo.close();
        } catch (FileNotFoundException e) {
            System.out.println("File aint there");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}


class WritingFilesList {
    public static void main(String[] args) {
        try (ObjectOutputStream ool = new ObjectOutputStream(new FileOutputStream("testL.bin"))) { //optimised way to write
        //try (FileOutputStream fol = new FileOutputStream("testL.bin"); ObjectOutputStream ool = new ObjectOutputStream(fol);) {
        //decalring multiple objects in try so that we dont need to close them manually
            Person[] people = {new Person(1,"Sandeep Bolla"),new Person(2,"Sampath Bolla")};
            ool.writeObject(people);

            ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));
            ool.writeObject(peopleList);

            ool.writeInt(peopleList.size());
            for(Person p:peopleList){ool.writeObject(p);}

        } catch (FileNotFoundException e) {
            System.out.println("File aint there");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}