package learn2;

class CarExtra extends Car{ //child class extending from parent class Car
    @Override //Override class is used to check if there exists a method to override in parent class
    public void printInfo() {
        System.out.println("Overriding the method in parent class");
        System.out.println(checking); //protected variables can be used in the package and child classes too
    }
}

public class Inheritanz {
    public static void main(String[] args) {
        CarExtra c1 = new CarExtra();
        c1.checking = 1;
        c1.printInfo();
    }
}