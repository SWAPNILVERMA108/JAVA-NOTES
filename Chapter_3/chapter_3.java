import java.util.SplittableRandom;

    public class chapter_3 {
        public static void main(String[] args) {
            String name = "Swapnil";

            System.out.println(name);
        int value = name.length();

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);


        System.out.println(value);
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('p', 'a'));
        System.out.println(name.replace("pni","am"));

        System.out.println(name.startsWith("Swa"));

            System.out.println(name.charAt(4));

            System.out.println(name.indexOf("p"));
        }
    }

