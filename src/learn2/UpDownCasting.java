package learn2;

class Machine {
    public void start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    public void start(){
        System.out.println("Camera Started");   
    }

    public void snap() {
        System.out.println("Camera Snapped");
    }
}

class Mobile extends Machine{
    public void start(){
        System.out.println("Mobile Started");
    }
}

class SunFlower {
    public void beauty() {
        System.out.println("The Sunflower is Beautiful");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Camera c1 = new Camera();
        c1.start();
        m1.start();


        //UPCASTING - going up one class ie. to parent class
        Machine m2 = new Camera(); //Machine methods are applicable Here but their definitions are of Camera class
        m2.start();
        //m2.snap(); ERROR

        //Machine m5 = new SunFlower(); Casting cant be done between unrelated classes
        
        //DOWNCASTING  - Going down one class ie. to child class
        
        Camera c2 = (Camera) m2; //Child class to Parent class cant be converted directly so we need to specify the type 
        c2.start();
        c2.snap();

        //Doesnt work -RTE
        //Machine m4 = new Machine();
        //Camera c3 = (Camera) m4;
        //c3.start();
        //c3.snap();

        //An object up-casted to a common parent from a child... cant be downcasted to another child of the common parent
        //ie...up&down casting should be between only a parent and a child objects. 


    }
}