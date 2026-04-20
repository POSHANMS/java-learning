package Problems;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a single scanner object
        Scanner scn = new Scanner(System.in);

        // Take an integer input
        int a = scn.nextInt();

        // Add 10 to the integer value
        a = a + 10;

        // Take a string input
        String s = scn.next();

        // Print the modified integer and the string
        System.out.println(a);
        System.out.println(s);

        // Close the scanner object
        scn.close();
    }
}
