package Basic;

import java.util.Scanner;

public class FindAreaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int bre = sc.nextInt();

        System.out.println(len * bre);

        sc.close();
    }
}
