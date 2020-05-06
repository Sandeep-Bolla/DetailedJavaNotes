package learn2;

/* this stuff only opplicable to methods and instance variables but not classes
private - can be accessed only INSIDE THE CLASS
no access modifier - can be accessed only INSIDE THE PACKAGE (along with class mentioned above)
protected - can be accesssed in subclasses too though they are defined outside the package (along with class and package)
public - can be accessed from anywhere
*/

// to a class public modifier can be written only when for it's own file name
//Eg: In this file public class Car{} cant be written

class Car{
    /*classes contain
        1.Data/State - (instantenous variables) 
        2.Subroutines - (methods)
    */

    protected static int cnt; //static variables are for class but not object... static variables are same for all objects of a class
    private final static float CONVERTER = 5/18; //final keyword is used for a constant that need not be changed in future...
    //As a convention constants are represented by capitals
    private String company;
    private float mileage;
    private int id;

    protected int checking; //protected variables can be used in the same package and child classes too
    
    public Car(){
        //default constructor
        this("Car0",0f); //Using a constructor inside one constructor
        //This should be used in only first line of the constructor else gives an erroe
        //company="car0";
        //mileage= 0f;
    }

    public Car(String company,float mileage){
        cnt++;id=cnt;
        this.company = company;
        this.mileage = mileage*CONVERTER; //to print mileage in m/sec
    }

    void giveComName(String company){
        this.company = company; //nearest one can be directly called ie. the parameter
    }

    void giveMil(float mileage){
        this.mileage = mileage;
    }

    void giveInfo(String company,float mileage){
        giveComName(company); //here as there is only one usage... no need to use this keyword
        giveMil(mileage);
    }

    void printInfo(){
        System.out.print(id+"\t");
        System.out.print(company+"\t");
        System.out.println(mileage);
    }

    String checked(boolean preCheck) {
        if(preCheck==true) return "Checked";
        else return "Not Checked";
    }

}


public class Classes {
    public static void main(String[] args) {
        Car city= new Car();
        city.printInfo();
        //Car.cnt=1; static variables are for class but not  for Object
        //city.company = "Honda"; CAN'T Acces the private instance variables outside the class
        //city.mileage=35.3f;
        city.giveInfo("Honda",32.0f);
        city.printInfo();
        boolean pre=false;
        //String fin = city.checked(pre);
        System.out.println(city.checked(pre)); //Directly printing the return value

        Car a3 = new Car("Audi",15.1f);
        a3.printInfo();
    }
}