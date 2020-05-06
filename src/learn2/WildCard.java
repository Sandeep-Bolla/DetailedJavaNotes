package learn2;

import java.util.ArrayList;

class Ape {
    @Override
    public String toString() {
        return "I'm an Ape";
    }
    public void smtng(){
        System.out.println("Hello It's me Sampath the ape");
    }
}

class Human extends Ape{
    @Override
    public String toString() {
        return "I'm a Human";
    }

}


public class WildCard {
    public static void main(String[] args) {
        ArrayList<Ape> l1 = new ArrayList<>();
        l1.add(new Ape());l1.add(new Ape());l1.add(new Human());
        ArrayList<Human> l2 = new ArrayList<>();
        l2.add(new Human()); //l2.add(new Ape()); ERROR
        l2.add(new Human());

        showList1(l1);
        //showList1(l2); since that fn takes only List of Ape-class odjects
        showList2(l1);
        //ArrayList<SunFlower> s1=new ArrayList<>();
        //showList2(s1);

        showList2(l2); //Using wildcard loop works for both

        showList3(l1);
        showList3(l2); //using wildcard with extends...loop fn works for the class Ape and all subclasses extending from it.

        showList4(l1);
        showList4(l2);
        
        //showList4(s1); Do not work for the objects that is not a parent of the Human 
    }
    public static void showList1(ArrayList<Ape> li) {
        for(Ape a: li){
            System.out.println(a);
            a.smtng();
        }
    }

    //Using Wild Card
    public static void showList2(ArrayList<?> li) {
        for(Object a:li){ //Object is parent of all the classes
            System.out.println(a);
            //a.smtng(); ERROR since it is not Ape specific method
        }
    }

    public static void showList3(ArrayList<? extends Ape> li) {
        for(Ape a:li){ 
            System.out.println(a);
            a.smtng();
        }
    }
    public static void showList4(ArrayList<? super Human> li) {
        for(Object a:li){
            System.out.println(a);
            //a.smtng(); ERROR since each element in  list is Object class
        }
    }

}