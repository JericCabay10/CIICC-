package rope;

// public class Rope {
//     public static int LENGTH = 5;
    
//     static {
//     LENGTH = 10;
//     }
 
//     public static void swing() {
//         System.out.print("swing ");
//     }

// }

// public class Rope {
//     public static void swing() {
//         System.out.print("swing ");
//     }
        
//     public void climb() {
//         System.out.println("climb ");
//     }
         
//     public static void play() {
//         swing();
//         climb();
//     }

//     public static void main(String[] args) {
//         Rope rope = new Rope();
//         rope.play();
//         Rope rope2 = null;
//         rope2.play();
//     }
// }

// public class RopeSwing {
//        private static final String leftRope;
//        private static final String rightRope;
//        private static final String bench;
//        private static final String name = "name";
//       static {
//            leftRope = "left";
//            rightRope = "right";
//          }
//      static {
//          name = "name";
//          rightRope = "right";
//        }
//       public static void main(String[] args) {
//            bench = "bench";
//         }
//    }

  //  public class StringBuilders {
  //       public static StringBuilder work(StringBuilder a, StringBuilder b) {
  //              a = new StringBuilder("a");
  //              b.append("b");
  //              return a;
  //            }
  //           public static void main(String[] args) {
  //                 StringBuilder s1 = new StringBuilder("s1");
  //                 StringBuilder s2 = new StringBuilder("s2");
  //                 StringBuilder s3 = work(s1, s2);
  //                 System.out.println("s1 = " + s1);
  //                 System.out.println("s2 = " + s2);
  //                 System.out.println("s3 = " + s3);
  //               }
  //     }

// public class BirdSeed {
//        private int numberBags;
//         boolean call;
//         public BirdSeed() {
//                this(2);
//                call = false;
//          }
//         public BirdSeed(int numberBags) {
//         this.numberBags = numberBags;
//          }
//         public static void main(String[] args) {
//                BirdSeed seed = new BirdSeed();
//                System.out.println(seed.numberBags);
//        } 
// }

 public class Order {
        static String result = "";
        { result += "c"; }
        static
       { result += "u"; }
        { result += "r"; }
     }

 public class OrderDriver {
       public static void main(String[] args) {
             System.out.print(Order.result + " ");
             System.out.print(Order.result + " ");
             new Order();
             new Order();
             System.out.print(Order.result + " ");
 }
}