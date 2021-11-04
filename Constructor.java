package OOP.Constructor;

public class Constructor {

    // int roll;
    // double gpa;
    // public Constructor(int p, double q){
        // System.out.println("Limon");
        // System.out.println("Answer");
        // System.out.println(47);
        
        // System.out.println(p);
        // System.out.println(q);

    //     roll = p;
    //     gpa = q;
    // }


    // Let's explore access modfiers for classes (public and default)
    public int roll = 12;
    public double gpa = 2.3;
    


    // Let's explore access modfiers (public, protected, protected and default)
    public String nm = "Limon"; // public
    String p = "Poor"; // default
    private String email = "nhlimon37@gmail.com";
    private void my(){
        System.out.println("Hello Private Methods");
    }
    

    public static void main(String[] args) {
        // Constructor con = new Constructor();
        // Constructor newcon = new Constructor(256, 25.6);
        // Constructor newcons = new Constructor(135735, 3.89);
        // System.out.println(newcons.roll);
        // System.out.println(newcons.gpa);


        // ---
        // Modifiers mod = new Modifiers();// Because of being a default class, the Modifiers class is accessible here. :) Because it is placed at the same package(OOP) now. :P
        // System.out.println(mod.name);


        // Practicing private
        Constructor cons = new Constructor();
        // System.out.println(cons.roll);
        // System.out.println(cons.gpa);
        System.out.println(cons.email);
        cons.my();
         // email and my() are private but accessible from here, because, the private attributes / methods can be accesed only from the declared class. :)
    }
}
