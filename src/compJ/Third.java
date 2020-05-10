package compJ;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            Long n=sc.nextLong();
            Long k= sc.nextLong();
            Long ans =k*n;
            if(ans%(n-1)!=0) System.out.println(ans/(n-1));
            else {ans=ans/(n-1);System.out.println(ans-1);}
            t--;
        }

        sc.close();
    }
}