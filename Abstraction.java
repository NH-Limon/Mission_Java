// package OOP;

// abstract class MyAbstractClass{
//     int a = 12;
//     int b = 20;
//     int result = b - a;
//     public void myMethod(){
//         System.out.println(result);
//     }
//     public abstract void anometh();
// }

// class MyCl extends MyAbstractClass{
//     public void anometh(){
//         System.out.println("My name is Nahid Hasan Limon");
//     }
//     public void output(){
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(result);
//         myMethod();
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         MyCl obj = new MyCl();
//         obj.output();
//         obj.anometh();
//     }
// }




package OOP;

// abstract class Abs{
//     public String email = "nhlimon37@gmail.com";
//     public void showEmailAndName(String name){
//         System.out.println("Name is : " + name);
//         System.out.println("Email: " + email);
//     }
//     public abstract void absMeth();
// }

// class InhAbs extends Abs{
//     public void absMeth(){
//         System.out.println("This is an abstract method");
//     }
// }


abstract class Limon{
    public double gpa = 3.5;
    public String address = "Barishal, Bangladesh";
    // Regular method
    public void showAddress(){
        System.out.println("Address: " + address);
    }
    // Abstract method
    public abstract void showId();
}

class Abstract extends Limon{
    String country = "Bangladesh";
    public void showId(){
        System.out.println("Id: " + "Nahid Hasan");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        // InhAbs absobj = new InhAbs();
        // System.out.println(absobj.email);
        // absobj.showEmailAndName("Nahid Hasan Limon");
        // absobj.absMeth();


        Abstract absObj = new Abstract();
        System.out.println(absObj.gpa);
        System.out.println(absObj.address);
        absObj.showAddress();
        absObj.showId();
    }
}



// Now, it's time to briefly explore the abstraction concept of java. I am going to make a details explanation of all the things related to abstraction I have learned. Let's go:



// First we are declaring an abstract class using the abstract keyword:
abstract class MyAbstractClass{
    // We can put any public/ default attribute here in this abstract class:
    public int a = 10;
    String s = "Hello";
    // We can take any regular method here:
    public void myMethod(){
        System.out.println(100);
    }
    // We can put abstract method also, but need to know that, we cannot set the body of the abstract method here, we can just declare the method and will set the body from an inherited class.
    public abstract void myAbstractMethod();
}

// Now we are going to make an inheritance of the MyAbstractClass abstract class. :)
class NewInheritedClass extends MyAbstractClass{
    // Here, we should placed the abstract method's body which I declared before. :P
    // But need to know that, we cannot use the abstract keyword, when we are making the body of the abstract method. :)
    public void myAbstractMethod(){
        System.out.println("This is my abstract method");
    }
    // In this inherited class, we can also declare a lot more stuffs. For example, any attribute, regular method etc.

    // So, now in the main method, we need to create an object of the inherited class. Need to know that, we cannot make an object for an abstract class. We can make object of its inherited class.

    public static void main(String[] args) {
        NewInheritedClass newObj = new NewInheritedClass();
        // Now we can access everything of the abstract and its inherited class using this object
        System.out.println(newObj.a);
        System.out.println(newObj.s);
        newObj.myMethod();
        newObj.myAbstractMethod();
    }
}