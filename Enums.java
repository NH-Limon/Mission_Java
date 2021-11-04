// package ProcedureJava;

// public class Enums {
//     enum Level{
//         LOW,
//         MEDIUM,
//         HIGH
//     }
    
//     public static void main(String[] args) {
//         Level l = Level.LOW;
//         Level m = Level.MEDIUM;
//         Level h = Level.HIGH;
//         System.out.println(l);
//         System.out.println(m);
//         System.out.println(h);
//     }
// }




package ProcedureJava;

// enum Person{
//     LIMON,
//     RIMON,
//     TANVIR,
//     KAMRUL
// }


enum Fruit{
    MANGO,
    APPLE,
    BERRY,
    LICHI
}

public class Enums{

    // Enum inside a Class

    // enum Book{
    //     BANGLA,
    //     ENGLISH,
    //     MATH,
    //     SCIENCE
    // }


    // enum Limon{
    //     BOY,
    //     STUDENT,
    //     LEARNER,
    //     PROGRAMMER,
    //     INNOCENT,
    //     GOOD
    // }

    // NOTE: We can use lowercase letters as enum's values but the convention is to take them as uppercase letters.


    enum Number{
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
    }

    public static void main(String[] args) {
        Number o = Number.ONE;
        Number t = Number.TEN;
        System.out.println(o);
        System.out.println(t);
        System.out.println("-------------------");
        for (Number num : Number.values()){
            System.out.println(num);
        }


        // Person l = Person.LIMON;
        // Person r = Person.RIMON;
        // Person t = Person.TANVIR;
        // Person k = Person.KAMRUL;
        // System.out.println(l);
        // System.out.println(r);
        // System.out.println(t);
        // System.out.println(k);


        // Fruit a = Fruit.APPLE;
        // Fruit l = Fruit.LICHI;
        // Fruit m = Fruit.MANGO;
        // Fruit b = Fruit.BERRY;

        // System.out.println(a);
        // System.out.println(l);
        // System.out.println(m);
        // System.out.println(b);


        // Book b = Book.BANGLA;
        // Book e = Book.ENGLISH;
        // Book m = Book.MATH;
        // System.out.println(b);
        // System.out.println(e);
        // System.out.println(m);


        // Enum in a Switch Statement
        // Book x = Book.SCIENCE;
        // switch(x){
        //     case ENGLISH:
        //     System.out.println("This is English");
        //     break;
        //     case BANGLA:
        //     System.out.println("This is Bangla");
        //     break;
        //     case MATH:
        //     System.out.println("This is Math");
        //     break;
        //     default:
        //     System.out.println("This is nothing");
        // }


        // Loop Through an Enum
        // for (Book myVar : Book.values()){
        //     System.out.println(myVar);
        // }


        // for (Limon lim : Limon.values()){
        //     System.out.println(lim);
        // }
    }
}