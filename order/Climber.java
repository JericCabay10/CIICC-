package order;
// public class Order {
//     String value = "t";
//     { value += "a"; }
//     { value += "c"; }
//     public Order() {
//         value += "b";
//     }

//     public Order(String s) {
//         value += s;
//     }
// public static void main(String[] args) {
//     Order order = new Order("f");
//     order = new Order();
//     System.out.println(order.value);
//     } 
// }

// public class Create {
//        Create() {
//             System.out.print("1 ");
//        }
//        Create(int num) {
//             System.out.print("2 ");
//        }
//        Create(Integer num) {
//            System.out.print("3 ");
//        }
//        Create(Object num) {
//           System.out.print("4 ");
//        }
//        Create(int... nums) {
//           System.out.print("5 ");
//        }
//        public static void main(String[] args) {
//             new Create(100);
//             new Create(1000L);
//        }
// }

// import java.util.function.*;

// public class Panda {
//     int age;
//     public static void main(String[] args) {
//     Panda p1 = new Panda();
//         p1.age = 1;
//         check(p1, p -> p.age < 5);
// Panda p2 = new Panda();
// }
// private static void check(Panda panda, Predicate<Panda> pred) {
// String result = pred.test(panda) ? "match" : "not  match";
// System.out.print(result);
// } 
// }

interface Climb {
boolean isTooHigh(int height, int limit);
}

public class Climber {
         public static void main(String[] args) {
        check((h, l) -> h.append(l).isEmpty(), 5);
 }
 private static void check(Climb climb, int height) {
       if (climb.isTooHigh(height, 10))
             System.out.println("too high");
       else
             System.out.println("ok");
      }
    }    