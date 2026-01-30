public class code {

    public static void main(String[] args) {

        // ===============================
        // Topic 1: Operator Precedence
        // ===============================

        int a = 6 * 5 - 34 / 2;
        System.out.println("Operator Precedence Result: " + a);


        // ===============================
        // Topic 2: Data Types in Expressions
        // ===============================

        byte x1 = 5;
        int y1 = 6;
        short z1 = 8;

        int c = y1 + z1;
        System.out.println("Data Types Result: " + c);


        // ===============================
        // Topic 3: Increment Operators
        // ===============================

        int i = 56;

        System.out.println("Post-Increment: " + i++);
        System.out.println("After Post-Increment: " + i);

        System.out.println("Pre-Increment: " + ++i);
        System.out.println("Final Value: " + i);


        // ===============================
        // Practice Set
        // ===============================

        int y = 7;
        int x = ++y * 8;
        System.out.println("Practice Set Value of x: " + x);

        char ch = 'a';
        System.out.println("Incremented Character: " + ++ch);

    }
}
