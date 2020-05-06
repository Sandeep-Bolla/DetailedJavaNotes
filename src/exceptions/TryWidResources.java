package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Best way to read documents in java

//Try wid resources only works for the classes that implements AutoClosable interface
//since it automatically attempts to call close methods after the completion of code in try block

public class TryWidResources {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader(new File("lol1.txt")))) {
            String line;
            //FileReader fffr = new FileReader("file.txt");
            //System.out.println(bf.ready());
            while((line = bf.readLine())!=null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Sorry Mann!! File ain't there wid you");
            return; //If file is not found then return;
        } catch(IOException e) {
            System.out.println("Some IO Problem!!! Try next time");
        }
        finally{
            /*If you put a return, break, continue or any other java keyword that changes the sequential execution of code inside the catch block (or even try block)
            the statements inside the finally block will still be executed */
            System.out.println("This is Finally Block Code");
        }
        System.out.println("This code is after Finally Block");
    }
}