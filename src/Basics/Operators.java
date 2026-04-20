package Basics;

public class Operators {
    public  static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        // Unary Operators

        System.out.println("Postincrement :" + (a++));
        System.out.println("Preincrement :" + (++a));

        System.out.println("Postdecrement :" + (b--));
        System.out.println("Predecrement :" + (--b));

        // Assignment Operator
        int num = 20;
        System.out.println("Initial: " + num);

        // add 5 -> num = num + 5
        num += 5;
        System.out.println("After +5: " + num);

        num -= 5;
        System.out.println("After -5: " + num);

        num *= 2;
        System.out.println("After *2: " + num);

        num /= 2;
        System.out.println("After /2: " + num);

        num %= 2;
        System.out.println("After %2: " + num);

        // Relational Operators

        System.out.println("a > b: " + (a > b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == num));
        System.out.println("a != c: " + (a != num));

        // Logical Operators

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Ternary operator

        int c = 30;
        int result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("result : " + result);

        // Bitwise Operators

        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));

        // instanceof Operator

        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = 10;
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);

        // Operator Precedence and Associativity
        int res = 100 + 200 / 10 - 3 * 10;
        // Verifying the result of the same expression
        System.out.println("Final Output: " + res);

    }
}
