import java.util.Scanner;

public class practice_set_4 {
    public static void main(String[] args){

        //   question 1
//        int a = 10;
//        if(a = 11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

        //   question 2
//        System.out.println("Enter Your Marks");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first Sub marks : ");
//        float a = sc.nextFloat();
//        System.out.println("Enter second Sub marks : ");
//        float b = sc.nextFloat();
//        System.out.println("Enter third Sub marks : ");
//        float c = sc.nextFloat();
//        float Percentage = (a+b+c)/3;
//        System.out.println("percentage of three Sub : ");
//        System.out.println(Percentage);
//
//        if(Percentage>=40 && a>= 33 && b>= 33 && c>=33 ){
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }

        //   question 3
//        System.out.println("Enter your Income : ");
//        Scanner sc = new Scanner(System.in);
//        float I = sc.nextFloat();
//
//        if (I<=300000){
//            System.out.println("No Tax");
//        }
//        else if (I>300000 && I<= 700000){
//            System.out.println("5% Income Tax");
//            float T = (I*5)/100;
//            System.out.println("Income Tax : ");
//            System.out.println(T);
//
//        }
//        else if (I>700000 && I<= 1000000) {
//            System.out.println("10% Income Tax");
//            float T = (I*10)/100;
//            System.out.println("Income Tax : ");
//            System.out.println(T);
//        }
//        else if (I>1000000 && I<= 1200000) {
//            System.out.println("15% Income Tax");
//            float T = (I*15)/100;
//            System.out.println("Income Tax : ");
//            System.out.println(T);
//        }
//        else if (I>1200000 && I<= 1500000) {
//            System.out.println("20% Income Tax");
//            float T = (I*20)/100;
//            System.out.println("Income Tax : ");
//            System.out.println(T);
//        }
//        else {
//            System.out.println("30% Income Tax");
//            float T = (I*30)/100;
//            System.out.println("Income Tax : ");
//            System.out.println(T);
//        }
//
        //   question 4
        /*
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
}
         */

        //   question no 5
/*
        System.out.println("Enter Year : ");
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        if( (Y % 4 == 0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
 */

        //   question no 6

        System.out.println("Enter Website : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (str.endsWith(".org")) {
            System.out.println("Organization website");
        } else if (str.endsWith(".in")) {
            System.out.println("Indian Website");
        }


    }
}
