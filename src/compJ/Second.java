package compJ;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (k % 2 == 0 && n % 2 != 0)
                System.out.println("NO");
            else if (k > n)
                System.out.println("NO");
            else if (n % 2 == 0 && k % 2 != 0 && k > (n / 2))
                System.out.println("NO");
            else {
                System.out.println("YES");
                if (n % 2 == 0 && k % 2 != 0) {
                    for (int i = 0; i < k - 1; i++)
                        System.out.print(2 + " ");
                    System.out.println(n - (2 * (k - 1)));
                } else {
                    for (int i = 0; i < k - 1; i++)
                        System.out.print(1 + " ");
                    System.out.println(n - (k - 1));
                }
            }
            t--;
        }

        sc.close();
    }
}