package app;
import learn2.*;
import polymorph.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        UsingIntrfz p = new UsingIntrfz();
        UsingIntrfz p2 = new UsingIntrfz();
        p.showInfo();
        Interfaz info1 = new UsingIntrfz(); //this obj can access all the methods in interfaz but not UsingInterfz-specific methods
        Interfaz info2 = p2;
        info1.showInfo();
        info2.showInfo();
        outputInfo(info2);
        outputInfo(p);

        /* A variable decides what methods are to be called on it &
        when u call those methods its the physical object to which the reference is pointed... comes into picture ans runs the relevant code 
        */
        Plant pl1 = new Plant();
        Plant pl2 = new Tree(); // reference gives only methods that can be applied and when applied they apply of object on the other side
        
        // Tree tr1 = new Plant(); ::: not possible
        
        pl1.grow();
        pl2.grow(); //here pl2 can access only methods in the plant(along with its exclusive methods) class but when they are called they work as per the code in tree class


        pl2.plantex(); // when object instance of plant(parent) is created and equated to its child(tree), common methods in tree is overriden and exlculsive methods of plant can be accessed

        doGrow(pl1);
        Tree tree = new Tree();

        doGrow(pl2);
        doGrow(tree); //If a method can take a parent class it can take child class too but not vice-versa
    }

    private static void outputInfo(Interfaz info){ //all the classes that implements Interfaz can be passed into this method
        info.showInfo();
    }

    private static void doGrow(Plant plant){
        plant.grow();
        
    }
}