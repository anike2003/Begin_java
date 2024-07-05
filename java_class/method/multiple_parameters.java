public class multiple_parameters {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31




// public class Main {
//   static int myMethod(int x, int y) {
//     return x + y;
//   }

//   public static void main(String[] args) {
//     System.out.println(myMethod(5, 3));
//   }
// }
// // Outputs 8 (5 + 3)



// public class Main {
//   static int myMethod(int x, int y) {
//     return x + y;
//   }

//   public static void main(String[] args) {
//     int z = myMethod(5, 3);
//     System.out.println(z);
//   }
// }
// Outputs 8 (5 + 3)

