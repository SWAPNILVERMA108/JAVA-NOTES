import java.util.Scanner;

public class PracticeSet1 {

    public static void main(String[] args) 

        Scanner sc = new Scanner(System.in);

        // ---------------- Question 1 ----------------
        // Sum of Three Numbers

        System.out.println("\n--- Question 1: Sum of Three Numbers ---");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("Sum of three numbers: " + sum);


        // ---------------- Question 2 ----------------
        // CGPA Calculation

        System.out.println("\n--- Question 2: CGPA Calculation ---");

        System.out.print("Enter marks of subject 1: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks of subject 2: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks of subject 3: ");
        float m3 = sc.nextFloat();

        float cgpa = (m1 + m2 + m3) / 30;
        System.out.println("CGPA: " + cgpa);


        // ---------------- Question 3 ----------------
        // Greeting Program

        System.out.println("\n--- Question 3: Greeting Program ---");

        sc.nextLine(); // Clear buffer

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", Have a nice day!");


        // ---------------- Question 4 ----------------
        // Kilometer to Mile Conversion

        System.out.println("\n--- Question 4: Kilometer to Mile Conversion ---");

        System.out.print("Enter distance in kilometers: ");
        float km = sc.nextFloat();

        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);


        // ---------------- Question 5 ----------------
        // Check Integer Input

        System.out.println("\n--- Question 5: Check Integer Input ---");

        sc.nextLine(); // Clear buffer

        System.out.print("Enter any value: ");

        if (sc.hasNextInt()) {
            System.out.println("You entered an Integer.");
        } else {
            System.out.println("You did NOT enter an Integer.");
        }

        sc.close(); // Close Scanner
    }
}
```