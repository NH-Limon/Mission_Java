public class Methods {
    // static void myMethod(){
    //     System.out.println("This is my method");
    // }

    // Java method parameters
    // static void my(int a, int b){
    //     System.out.println(a * b);
    //     System.out.println(a + b);
    // }
    
    // static void info(String a, int b){
    //     System.out.println(a);
    //     System.out.println(b);
    // }


    // Return Values
    // static int mymeth(int a, int b){
    //     return a + b;
    // }

    // static String name(){
    //     return "Nahid Hasan Limon";
    // }

    // static char h(){
    //     return 'H';
    // }

    // static String mymethod(String firstname, String lastname){
    //     return firstname + " " + lastname;
    // }


    // A Method with If...Else
    // static void myMethod(int a, int b){
    //     if (a == b){
    //         System.out.println("a is equal to b");
    //     }
    //     else if (a > b){
    //         System.out.println("a is greater than b");
    //     }
    //     else if(a < b) {
    //         System.out.println("a is less than b");
    //     }
    //     else{
    //         System.out.println("Hey Bro. How is going?");
    //     }
    // }


    // Method Overloading
    // static void mymethod(int a, int b){
    //     System.out.println(a + b);
    // }

    // static void mymethod(String a, int b){
    //     System.out.println(a);
    //     System.out.println(b);
    // }

    // static void mymethod(double p, double q){
    //     System.out.println(p - q);
    // }

    // Let's see another example of method overloading
    static int mymeth(int p){
        return p;
    }
    static String mymeth(String p){
        return p;
    }


    public static void main(String[] args) {
        // myMethod();
        // my(10, 5);
        // info("Nahid Hasan Limon", 20);

        // Return Values
        // int result = mymeth(20, 10);
        // int anoresult = mymeth(30, 40);
        // System.out.println(result);
        // System.out.println(anoresult);

        // System.out.println(name());
        // System.out.println(h());

        // System.out.println(mymethod("Nahid Hasa", "Limon"));

        // myMethod(40, 50);


        // Method overloading
        // mymethod("Nahid Hasan Limon", 200);
        // mymethod(100, 200);
        // mymethod(3.5, 1.3);

        // System.out.println(mymeth("This is a string"));
        // System.out.println(200);
    }
}
