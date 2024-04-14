package Basic;

import java.util.Scanner;

public class ForLoop_Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] F = new int[n + 1];

        F[0] = 0;

        F[1] = 1;

        for (int i = 2; i <= n; i++) {

            F[i] = F[i - 1] + F[i - 2];

        }
        System.out.print(F[n]);
        sc.close();
    }
}
