package OOP.Constructor;

public class Constructors {
    String hobby;
    int age;
    public Constructors(String a, int b){
        // System.out.println(a);
        // System.out.println(b);
        hobby = a;
        age = b;
    }

    public static void main(String[] args) {
        Constructors myobj = new Constructors("Programming", 20);
        System.out.println(myobj.hobby);
        System.out.println(myobj.age);
    }
}
