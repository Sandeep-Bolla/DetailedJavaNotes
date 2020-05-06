package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//One way to handle exceptions by throwing the error
/*We can even write this opening of file in an individual static method
but then both the main method and this method should handle the exception*/
public class Throw {
    public static void main(String[] args) throws FileNotFoundException {
        File fi = new File("outout.txt");
        Scanner in = new Scanner(fi); //Used Scanner Here
        System.out.println("Finished...");
        in.close();
    }
}