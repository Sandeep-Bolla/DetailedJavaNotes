package polymorph;

public class Tree extends Plant{
    public void grow(){ //Here private or protected cant be given
        //Since, we cant reduce the visibility of a inherited method
        System.out.println("Treee Growing");
    }
    public void treeex(){
        System.out.println("tree used");
    }
}