package Problems;

import java.util.Scanner;

public class Typecast {
    public  static void main(String[] args) {
        /*
        TypeCast And Double It

        Given an input num as a string. You need to typecast into an integer and double it.
        Examples:

        Input: num = "5"
        Output: 10
        Explanation: Typecast "5" to int and then double it 5 * 2 = 10

        Input: num = "12"
        Output: 24
        Explanation: Typecast "12" to int and then double it 12 * 2 = 24
         */

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        int number = Integer.parseInt(num);
        number = number * 2;
        System.out.println(number);
        sc.close();

    }
}
