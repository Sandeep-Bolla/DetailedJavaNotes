package compJ;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            int cnt=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) !='0'){
                    cnt++;
                }
            }
            System.out.println(cnt);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) !='0'){
                    System.out.print(s.charAt(i));
                    for(int j=0;j<((s.length())-i-1);j++) System.out.print(0);
                    System.out.print(" ");
                }
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}