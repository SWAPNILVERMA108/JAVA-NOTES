/   make function or method  ...........................................................................

//  public class Chapter_7 {

//    static int logic(int x,int y){
//            int z;
//            if (x>y){
//                z= x+y;
//            }
//            else {
//                z = (x + y)*5;
//            }
//            return z;
//        }
//        public static void main(String[] args){
//            int a = 5;
//        int b = 7;
//        int c;
//        c = logic(a,b);
//
//        int a1= 2;
//        int a2 = 1;
//        int c1;
//        c1 = logic(a1,a2);
//        System.out.println(c);
//        System.out.println(c1);
//
//    }
//}


//public class Chapter_7 {
//
//     int logic(int x,int y){
//        int z;
//        if (x>y){
//            z= x+y;
//        }
//        else {
//            z = (x + y)*5;
//        }
//        return z;
//    }
//    public static void main(String[] args){
//        int a = 5;
//        int b = 7;
//        int c;
//        // method invocation using object creation
//         Chapter_7 obj = new Chapter_7();
//         c = obj.logic(a,b);
//       // c = logic(a,b);
//
//
//        int a1= 2;
//        int a2 = 1;
//        int c1;
//       // c1 = logic(a1,a2);
//        c1 = obj.logic(a1,a2);
//        System.out.println(c);
//        System.out.println(c1);
//    }
//}








      // method overloading  ...............................................................................

//      static void foo(){
//          System.out.println("Good morning bro!");
//      }
//      static void foo(int a){
//          System.out.println("Good morning " + a +" bro!");
//      }
//      static void foo(int a, int b){
//          System.out.println("Good morning " + a + " bro!");
//          System.out.println("Good morning " + b +" bro!");
//      }
//
//      static void change(int a){
//          a = 98;
//      }
//      static void change2(int [] arr){
//          arr[0] = 98;
//      }
//
//      static void telljoke() {
//          System.out.println("I invented a new world!\n" + "Plagiarisn!");
//      }
//      public static void main(String[] args) {
//          //telljoke();
// //          int x = 45;
// //          change(x);
// //          System.out.println(" the value of x after runnning change is : " + x);
//
//
//          //   case 1 : changing the integer :::::::::::::::::::::::::::
//
// //          int [] marks = {52, 73, 77, 89, 98, 94};
// //          change2(marks);
// //          System.out.println(" the value of x after runnning change is : " + marks[0]);
//
//          //   method overloading   :::::::::::::::::::::::
//          foo();
//          foo(3000);
//          foo(899,999);      // argument are actual
//
//      }





//      variable argument in java  ............................................................................

      public class Chapter_7 {

      static int sum(int a, int b){
          return a+b;
      }
      static int sum(int a, int b,int c){
          return a+b+c;
      }

          static int sum(int ...arr){
              int result = 0;
              for (int a: arr){
                  result = result + a;
              }
              return result;
          }
      public static void main(String[] args){
          System.out.println("welcome to varargs tutorial");
         System.out.println("the sum is 4 and 5 is: " + sum( 4, 5) );
        System.out.println("the sum is 3, 4 and 5 is: " + sum( 4, 5, 3));

          System.out.println("The sum of 2, 4, 6, 8 and 9 is : " + sum(2,4,6,8,9));
          System.out.println("sum of nothing :" + sum());


      }
  }
