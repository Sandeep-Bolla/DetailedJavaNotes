package learn2;

class Machina {
    public void start(){
        System.out.println("Start the Machine");
    }

}

interface Plant{
    public void grow();
    //public void death();
}


public class AnonymousClasses {
    public static void main(String[] args) {
        Machina m1 = new Machina(){
            @Override public void start(){
                System.out.println("M1 Started!!!");
            }
        };
        m1.start();

        //Plant p1 = new Plant() ERROR: Itefaces cant be instantiated like classes
        Plant p1 = new Plant(){
            @Override public void grow(){
                System.out.println("Oh my Gawd! Plant  is growing");
            }
        };
        p1.grow();
    }
}