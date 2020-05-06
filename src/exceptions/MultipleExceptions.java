package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test{
    public void run() throws IOException, FileNotFoundException {
        //throw new IOException();
        throw new FileNotFoundException("File not Found Chill ;)");
    }
}


public class MultipleExceptions {

    //Handling multi[;e exceptions - 1
    // public static void main(String[] args) throws IOException, FileNotFoundException{
    //     Test t1 = new Test();
    //     t1.run();
    // }


    //Handling multiple Exceptions -2 -> since every exception is child of parent class Exception 
    // public static void main(String[] args) {
    //     try {
    //         Test t1 = new Test();
    //         t1.run();
    //     } catch (Exception e) {
    //         System.out.println("File Not Found Brooo!");
    //     }
    // }

    //Handling multiple Exceptions - 3
    // public static void main(String[] args) {
    //     try {
    //         Test t1 = new Test();
    //         t1.run();
    //     }
    //     catch (FileNotFoundException | IOExcpetion e) { //ERROR:This method wont work here because FileNotFound is child of IOException
    //         System.out.println("Chilll ;)");
    //     }
    // }

    //Handling Excpetions - 4
    public static void main(String[] args) {
        try {
            Test t1 = new Test();
            t1.run();
        }
        //Here FileNotFound exception should be caught first bcause it's a child class of IOException... else compiler gives an error
        catch(FileNotFoundException e) { 
            System.out.println("Sorry man!!! FileNotFound");
        }
        catch (IOException e) {
            System.out.println("Some other IO error");
        }
    }

}