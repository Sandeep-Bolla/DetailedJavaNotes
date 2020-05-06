package abstractz;

//Abstract classes are used as the basic parent classes from which subclasses are ectended but individually abstract classes cant be implemented 

//Abstracy is useful for constructing Hirearchy of Classes 

public abstract class Machine {
    private int id;
    //getter
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }

    public abstract void start(); //Abstract method
    public abstract void stop();//Abstarct methods cant have body
    protected abstract void breaking();

    public void run(){
        start(); //abstract methods can be called inside normal methods
        breaking();
        stop();
    }
}