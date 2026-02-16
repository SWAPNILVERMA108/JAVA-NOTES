import java.util.Scanner;

public class practice_set_5 {
    public static void main(String[] args) {

        //      question 1
//        int n = 4;
//        for(int i=n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        //    question 2
//        System.out.println("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int i = 0;
//        int sum = 0;
//        while (i <= a){
//            i++;
//            System.out.println(2*i);
//            sum = sum + (2*i);
//        }
//        System.out.println("sum of n even number : ");
//
//        System.out.println(sum);

        //   question no 3
//        System.out.println("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//
//        for(int a=1; a<=10; a++){
//            System.out.println(s*a);
//
//        }

        //   question no 4

//        System.out.println("enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int a  = sc.nextInt();
//
//        for(int i = 10; i!=0; i--){
//            System.out.println(a*i);
//        }

        //   question no 5

//        System.out.println("enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int fact =1;
//
//        for(int i=1; i<=a; i++ ){
//            fact = fact*i;
//
//        }
//        System.out.println(fact);
//

//         question no 6

//        System.out.println("enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        int fact = 1;
//        int i = 1;
//        while (i<a){
//            i++;
//            fact = fact*i;
//        }
//        System.out.println(fact);

        //   question no 7

//        int n= 5;
//        int i=n;
//        while (i >0){
//            i--;
//
//            int j=0;
//            while (j<i){
//                j++;
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        //  question 9

//        int a = 8;
//        int sum = 0;
//        for (int i = 0; i<=10; i++){
//            System.out.println(i*a);
//            sum = sum +(i*a);
//        }
//        System.out.println("sum of table : ");
//        System.out.println(sum);


        //    question no 11
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=a; i++){
            System.out.println(2*i);
            sum = sum + (2*i);
        }
        System.out.println("sum of n even number : ");

        System.out.println(sum);
    }

