/////////////////BASICS///////////////////

package learn2;

import java.util.Scanner;

class Quickstart {
    public static void main(String[] args) {
        //Variables
        //1.premitive - Here particular size of memory is allocated for a partcular type of variable
        int myInt = 345; //int declaraion - 4 bytes &&& default value is ZERO unlike a garbage value in cpp
        /*similarly short: 2 bytes, long-8 bytes
        to store text... char-2 byte, byte-1byte
        to store decimal... float-4 byte, double-8 byte
        to store boolean... boolean-1 byte*/

        //2.non-premitive - Here size is not defined... as it's only a reference to the memory 
        String text; //string declaration
        text="Hello"; //now, memory is allocated for it based on the size of the string
        //default value for references - null
        System.out.print("This is printing without a new line at  the end"); //printing with print
        System.out.printf("This is printf with myInt %d", myInt); //printing with printf
        System.out.println("This is with println "+myInt); //printing with println to create a new line at the end
        System.out.println(text+" "+"sandeepBolla");

        //Taking Input
        Scanner inp = new Scanner(System.in); //scanner class object declaration
        int as = inp.nextInt(); //taking integer input
        //similarly- nextLong(),nextShort(), nextDouble(),nextBoolean(), nextChar(), nextByte()
        //nextLine for string
        System.out.println(as+" ");

        //For loop and while loop are same as cpp
        // do { ... } while()

        int[] arr = new int[5]; //array of integers
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); //numbers are initialized with ZERO
        }
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr2.length); //to print length of array
        char[] arr3 = new char[5];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr3[i]); //char is initilised with ' ' ie.SPACE
        }

        String[] stringArr = new String[3]; //array of strings
        for(String k:stringArr){
            System.out.println(k); // strings are instantiated with "null" pointer
        }

        //multi-dimensional arrays
        int[][] mulArr = {{1,2,3,4},{1,1,1},{5}};
        String[][] strmul = new String[5][]; //declaring with only fixing no of rows
        strmul[0] = new String[1];
        for(int i=0;i<mulArr.length;i++){
            for(int j=0;j<mulArr[i].length;j++){
                System.out.print(mulArr[i][j]+"\t");
            }
            System.out.println();
        }

        inp.close(); //clsing the Scanner instantiated on System.in
    }
}