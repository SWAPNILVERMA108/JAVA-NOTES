import java.util.Scanner;

public class chapter_4 {
    public static void main(String[] args) {


       boolean a = true;
       boolean b = true;
       if(a && b){
           System.out.println("y");
       }
       else {
           System.out.println("N");
       }
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>56) {
            System.out.println("you are experienced!");
        }
        else if(age>46){
            System.out.println("you are semi experienced!");
        }
        else if (age>36) {
            System.out.println("you are semi-semi experienced!");
        }
        else {
            System.out.println("you are not experienced!");
        }

 

        switch (age){
            case (18):
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }


    }
}