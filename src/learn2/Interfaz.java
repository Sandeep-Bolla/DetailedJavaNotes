package learn2;

public interface Interfaz {
    //variables declared in interface are by default public, static and final.
    //Since it is static you cannot call it instance variable.
    int f1=1;

    public void showInfo(); //interface can only have method declarations but not whole methods itslef
    
    static void printsmtng(){ //static and defaults methods can bbe implemented inside interfaces
        System.out.println("Printing Sometihng");
    }
}