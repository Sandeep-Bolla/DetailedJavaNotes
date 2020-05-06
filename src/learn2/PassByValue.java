package learn2;

class Perso{
    int id;
    String name;
    Perso(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

}

public class PassByValue{
    public static void main(String[] args) {
        PassByValue app = new PassByValue();

        int n1 = 33;
        System.out.println(n1);

        app.show(n1);
        System.out.println(n1);

        Perso p1 = new Perso("BollA");
        System.out.println("1.Person "+p1);

        app.show(p1); //if i would have called the method static then i could have called that method as just *show(p1)*
        System.out.println("4.Person "+p1);
    }

    public void show(int n1){ //just the value stored in that original variable is copied into another variable
        System.out.println(n1);
        n1 = 6; //value of new variable is changed... nothing happens to the original variable
        System.out.println(n1);
    }
    public void show(Perso perso){ //Here reference value is copied into a new variable
        System.out.println("2.Person "+perso);
        //p1.name = "Sandeep"; //this will change the 4.person since it is directly chaging the value of the *name* in that reference object
        perso = new Perso("Sandeep");//this will not change the 4.person
        //as its value is copied into it and now a new value is over-written but nothing happens to the original reference in main method
        System.out.println("3.Person "+perso);
    }
}