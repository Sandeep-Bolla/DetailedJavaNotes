package abstractz;

public class AppMain {
    public static void main(String[] args) {

        //Machine m1 = new Machine() ERROR: Machine is a abstract class
        Car c1 = new Car();
        c1.setID(3);
        c1.run();
        System.out.println(c1.getID());

    }
}