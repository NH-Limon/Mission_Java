// package OOP;

// public class Outerclass {
//     int x = 100;
//     public class Innerclass{
//         public void mymeth(){
//             System.out.println(x);
//         }
//     }
//     public static void main(String[] args) {
//         Outerclass inc = new Outerclass();
//         Outerclass.Innerclass myInner = inc.new Innerclass();
//         System.out.println(inc.x);
//         myInner.mymeth();
//     }
// }




package OOP;

public class Outerclass{
    int y = 100;
    String x = "Nahid Hasan Limon";
    public void mymeth(){
        System.out.println("This is a good idea");
    }

    public class Innerclass{
        double p = 3.6;
        public void mynewmeth(){
            System.out.println("This is another method");
        }
    }

    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        Outerclass.Innerclass inner = outer.new Innerclass();
        System.out.println(outer.x);
        System.out.println(outer.y);
        outer.mymeth();
        // --
        System.out.println(inner.p);
        inner.mynewmeth();
    }
}