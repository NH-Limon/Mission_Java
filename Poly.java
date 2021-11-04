package OOP.Polymorphism;

public class Poly {
    public void showText(){
        System.out.println("This is a text");
    }

    public static void main(String[] args) {
        Poly p1 = new Poly();
        p1.showText();

        MyPoly p2 = new MyPoly();
        p2.showText();

        MyAnotherPoly p3 = new MyAnotherPoly();
        p3.showText();
    }
}

class MyPoly extends Poly{
    public void showText(){
        System.out.println("This is also a text");
    }
}

class MyAnotherPoly extends Poly{
    public void showText(){
        System.out.println("This text is written by Nahid Hasan Limon");
    }
}

