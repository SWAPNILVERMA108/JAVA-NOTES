import java.util.Scanner;
public class Chapter_1 {


        public static void main(String[] args) {
            System.out.println("Taking marks From the User");
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter marks of sub 1 :");
            float a = sc.nextFloat();
            System.out.println("Enter marks of sub 2 :");
            float b = sc.nextFloat();
            System.out.println("Enter marks of sub 3 :");
            float c = sc.nextFloat();
            System.out.println("Enter marks of sub 4 :");
            float d = sc.nextFloat();
            System.out.println("Enter marks of sub 5 :");
            float e = sc.nextFloat();

            float percentage = ((a + b + c + d + e)*100)/500;
            System.out.println("Percentage is : ");
            System.out.println(percentage);



        }
    }
