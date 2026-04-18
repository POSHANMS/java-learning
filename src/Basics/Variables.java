package Basics;

public class Variables {
    public static void main(String[] args) {
        // Declaring and initializing variables

        // Integer variable
        int age = 25;

        // String variable
        String name = "Rajesh";

        // Initializing float variable
        float si = 5.5f;

        // Initializing character variable
        char var = 'h';

        // Double variable
        double salary = 4500.00;

        // Displaying the values of variables
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Si: " + si);
        System.out.println("Var: " + var);
        System.out.println("Salary: " + salary);

        /*
            Implicit casting: Happens automatically when converting
            from a narrower range data type to a wider range data type
            converting an int to a double/float/long
            converting afloat to a double
         */
        double d1 =4;
        double d2 =5.f;
        long l1 = 100;
        /*
            Explicit casting: Does not happen automatically. Should be
            done by the programmer when converting from a wider to a
            narrower data type
            converting a double/float/long to an int Full screen
            converting a double to a float
         */
        int i1 = (int) 4.5;
        int i2 = (int) 5L;
        float f1 = (float) 4.5;

    }
}