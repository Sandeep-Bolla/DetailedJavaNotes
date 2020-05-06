package learn2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritngIntiFileWidBufferedReder {
    public static void main(String[] args) {
        try(BufferedWriter br = new BufferedWriter(new FileWriter(new File("test1.txt")))){
            br.write("First ever writing Haaa!"); br.newLine();
            br.write(104); //Writing ASCII values
        } catch(IOException e){
            System.out.println("CANT WRITE Sorry Bro...");
            return;
        }
        finally{
            System.out.println("I know u will be printed anyhow because u r in finally block");
        }
    }
}