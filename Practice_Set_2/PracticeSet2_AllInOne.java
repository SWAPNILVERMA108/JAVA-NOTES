import java.util.Scanner;

public class PracticeSet2_AllInOne {

    public static void main(String[] args) {

        // Question 1
        float q1 = 7 / 4 * 9 / 2;
        System.out.println("Q1 Output: " + q1);


        // Question 2
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println("Encrypted: " + grade);

        grade = (char) (grade - 8);
        System.out.println("Decrypted: " + grade);


        // Question 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Greater than 8: " + (num > 8));


        // Question 4
        float a = 7;
        float s = 8;
        float v = 9;
        float u = 6;

        float t = (v * v - u * u) / (2 * a * s);
        System.out.println("Formula Result: " + t);


        // Question 5
        int result = (7 * 49 / 7 + 35 / 7);
        System.out.println("Q5 Result: " + result);

    }
}