package serializasion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadingFiles {
    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("test1.bin")) {
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.println(oi.readObject());
            oi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception... Deal with it");

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception.. Deal with it too Bro");
        }
    }
}

class ReadingFilesList {
    public static void main(String[] args) {
        try (ObjectInputStream oil = new ObjectInputStream(new FileInputStream("testL.bin"));) {
      //try (FileInputStream fil = new FileInputStream("testL.bin"); ObjectInputStream oil = new ObjectInputStream(fil);)  {
            Person[] people2= (Person[]) oil.readObject();

            //System.out.println(people2); prints only Hashcode

            for(Person person: people2){System.out.println(person);}

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList2 = (ArrayList<Person>) oil.readObject();
            for(Person p:peopleList2){
                System.out.println(p);
            }

            int k = oil.readInt();
            ArrayList<Person> peopleList3 = new ArrayList<>(); 
            for(int i=0;i<k;i++){
                peopleList3.add((Person) oil.readObject());
                System.out.println(peopleList3.get(i));
            }



        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception... Deal with it");

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception.. Deal with it too Bro");
        }
    }
}