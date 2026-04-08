package Basics;

// Main class
public class Data_Types {

    public static void main(String[] args) {

        /*
        =========================
        Primitive Data Types
        =========================
        boolean, byte, char, short, int, long, float, double
        */

        // Boolean
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Fish Tasty? " + isFishTasty);

        // Byte
        byte age = 25;
        byte temperature = -5;
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);

        // Short
        short students = 1000;
        short temp = -200;
        System.out.println("Students: " + students);
        System.out.println("Temperature: " + temp);

        // Int
        int population = 10_000_000;
        int distance = 12_900_000;
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);

        // Long
        long worldPopulation = 7_800_000_000L;
        long lightYears = 9_876_543_210_000L;
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Light Years: " + lightYears);

        // Float
        float pi = 3.14f;
        float gravity = 9.8f;
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);

        // Double
        double precisePi = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Precise Pi: " + precisePi);
        System.out.println("Avogadro: " + avogadro);

        // Char
        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);


        /*
        =========================
        Non-Primitive Data Types
        =========================
        String, Class, Object, Interface, Array
        */

        // String
        String name = "John";
        String surname = "Doe";
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);

        // Class & Object
        Car myCar = new Car("Toyota", 2020);
        myCar.display();

        Car anotherCar = new Car("Honda", 2021);
        System.out.println("Model: " + anotherCar.model);
        System.out.println("Year: " + anotherCar.year);

        // Interface
        Animal dog = new Dog();
        dog.sound();

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"John", "Raj", "Sanjay"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);
    }
}

/*
=================================
Separate Class (Recommended Style)
=================================
*/
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car: " + model + " (" + year + ")");
    }
}

/*
=================================
Interface & Implementation
=================================
*/
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof");
    }
}