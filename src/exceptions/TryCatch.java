package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        File fi = new File("output.txt");
        try {
            FileReader fre = new FileReader(fi); //Used FileReader Here
            //Next line wont work if ther's an exception
            System.out.println("So... File's There...");
            fre.close();
        } catch (FileNotFoundException e) {
            System.out.println("Don't Chill Bro! Create another one!!!");
            //e.printStackTrace();
        }
        System.out.println("Finished...");
    }
}