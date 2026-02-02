import java.util.Scanner;

public class practice_set_3 {
    public static void main(String[] args) {



          //question 1
        String str = "Swapnil";
       String lstr = str.toLowerCase();
       System.out.println(lstr);

          //question 2
       String str = "I am Swapnil";
       System.out.println(str.replace(' ', '_'));

          //question 3
       String str = "Dear <|name|> , Thanks a lot.";
       System.out.println(str.replace("<|name|>","Swapnil"));

         // question 4
       String str = "Hello  everyone , this    string contains    double and triple spaces ";
       System.out.println(str.indexOf("  "));
       System.out.println(str.indexOf("   "));

         //question 5
        System.out.println("\"Dear Swapnil , This Java is nice . Thanks\"");

    }
}