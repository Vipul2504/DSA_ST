package Basic;

import java.util.Scanner;

public class If_Else {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            return "greater";
        } else if (a < b) {
            return "smaller";
        } else {
            return "equal";
        }
    }

}
