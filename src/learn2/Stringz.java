package learn2;

public class Stringz {
    public static void main(String[] args) {
        //Inefficient cause in JAVA String is IMMUTABLE
        //whenever += is used it's copying the old data into it and then refence it
        String info = "";
        info+= " I am You"; info+=" & "; info+="You are I";
        System.out.println(info);

        //Efficent
        StringBuilder sb= new StringBuilder("I am Sandeep");
        sb.append(" Bolla");
        System.out.println(sb);

        int n=5;
        StringBuilder sb2= new StringBuilder();
        sb2.append(n).append(" are").append(" You?");
        System.out.println(sb2);

        //////////////FORMATTING/////////////////
        System.out.println("Some text \t For the Test \n");
        System.out.printf("I have %d Freinds in life\n",3);
        for(int i=100;i<112;i++){
            System.out.printf("%2d: is a number\n",i); //2 characters with spaces if any before the number
        }
        for(int i=8;i<12;i++){
            System.out.printf("%-3d: is a number\n",i); //2 characters with spaces if any after the number
        }
        System.out.printf("Fromatting a float %f...\n",385.1787);
        System.out.printf("Formatting a float %.2f...\n",385.1787);
        System.out.printf("Formatting a float %-6.1f...\n",385.1787); //Here 8 characters in total with spaces if any after the number and only one number after decimal
    }
}