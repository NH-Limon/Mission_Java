package OOP.Inheritance;

final class Inheritance {
    public int a = 20;
    public String s = "Limon";
    public void mymeth(){
        System.out.println("Nahid Hasan Limon is here");
    }
    int h = 45;
    protected int i = 45;
}

// class Inher extends Inheritance{
//     private String password = "123456789";
//     public static void main(String[] args) {
//         Inher inh = new Inher();
//         System.out.println(inh.a);
//         System.out.println(inh.s);
//         System.out.println(inh.h);
//         inh.mymeth();
//         System.out.println(inh.password);

//         // We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
//     }
// }



// If you don't want other classes to inherit from a class, use the final keyword
// class NewInher extends Inheritance{
    // private String hello = "Hello";
    // private int x = 100;

    // public static void main(String[] args) {
    //     NewInher ninh = new NewInher();
    //     System.out.println(ninh.a);
    //     System.out.println(ninh.s);
    //     System.out.println(ninh.h);
    //     System.out.println(ninh.i);
    //     System.out.println(ninh.x);
    //     System.out.println(ninh.hello);
    //     ninh.mymeth();
    // }
// }