package OOP;

public class MyClass {
    // int a = 25;
    // int b = 5;
    // int result = a + b;
    // String myname = "Limon";
    // char d = 'D';

    // If you don't want the ability to override existing values, declare the attribute as final :
    final int c = 100;

    public static void main(String[] args) {
        OOP hey = new OOP();        
        // System.out.println(hey.name);
        // System.out.println(hey.age);
        // System.out.println(hey.gpa);
        // System.out.println(hey.isGood);


        // Modify Attributes
        hey.name = "NH Limon";
        hey.age = 21;
        hey.isGood = false;
        System.out.println(hey.name);
        System.out.println(hey.age);
        System.out.println(hey.isGood);

        // Third th = new Third();
        // th.mymeth();
    }
}
