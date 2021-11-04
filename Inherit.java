package OOP.Inheritance;

public class Inherit {
    protected int c = 100;
    protected String p = "Hey";
    public void mymethod(){
        System.out.println("This is a method");
    }
}


class Inh extends Inherit{
    public static void main(String[] args) {
        Inh inher = new Inh();
        System.out.println(inher.c);
        System.out.println(inher.p);
        inher.mymethod();
    }
}