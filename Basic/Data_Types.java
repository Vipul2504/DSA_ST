package Basic;

import java.util.Scanner;

public class Data_Types {

    public static int dataTypes(String type) {

        // Write your code here

        switch (type) {

            case "Integer":

                return 4;

            case "Long":

                return 8;

            case "Float":

                return 4;

            case "Double":

                return 8;

            case "Character":

                return 1;

            default:

                return -1;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Data type: ");

        String type = sc.next();

    }

}