package abstractz;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Starting on");

    }

    @Override
    public void stop() {
        System.out.println("Stopping Off");
    }

    @Override
    protected void breaking() {
        System.out.println("On the verge of Breaking");
    }

}