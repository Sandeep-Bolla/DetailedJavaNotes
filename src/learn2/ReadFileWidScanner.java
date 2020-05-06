package learn2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFileWidScanner {
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "C:/Users/sande/Desktop/lol1.txt";
        String fileName = "lol1.txt";
        File txtFile = new File(fileName);
        Scanner in = new Scanner(txtFile);
        int n = in.nextInt();System.out.println(n);
        in.nextLine();
        HashMap<Integer,Integer> m1 = new HashMap<>();
        for(int i=0;i<n;i++){
            m1.put(in.nextInt(),in.nextInt());
        }
        System.out.println(m1);
        // while(in.hasNextLine()) {
        //     System.out.println(in.nextLine());
        // }
        in.close();
    }
}