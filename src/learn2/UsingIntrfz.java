package learn2;

public class UsingIntrfz implements Interfaz { //class can *implement* multiple interfaces unlike single parent class to *extend* from
    String s = "Hello World1";
    public UsingIntrfz(){
        System.out.println(s);
        //System.out.println(f1);
    }

    @Override
    public void showInfo() {
        System.out.println("INFO SHOWN");
    }
}