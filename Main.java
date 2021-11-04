package ProcedureJava;
// import OOP.Constructor;
// import OOP.Modifiers;


// File No: 1
public class Main{
    // public static void main(String[] args) {
    //     System.out.println("Hello Nahid Hasan Limon");
    // }

    

    // Comments In Java
    // public static void main(String[] args) {
        // This is a single line comment
        /* This is a multi-line comment
        which is written by
        Nahid Hasan Limon */
    // }


    // Variables In Java
    public static void main(String[] args) {
        // String name = "Nahid Hasan Limon";
        // System.out.println(name);
        // int a = 4;
        // double d = 3.6;
        // float f = 55.64f;
        // char c = 'C';
        // boolean tr = true;
        // boolean fl = false;
        // System.out.println(a);
        // System.out.println(d);
        // System.out.println(f);
        // System.out.println(c);
        // System.out.println(tr);
        // System.out.println(fl);

        // Creating multiple variables of same type at a time
        // int a, b , c, d;
        // a = 45;
        // b = 100;
        // c = 23;
        // d = 233;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);

        // Change the value of a variable
        // String address = "Barishal";
        // address = "Dhaka";
        // System.out.println(address); // Dhaka

        // Creating Immutable Variable In Java
        // int a = 100;
        // a = 200;
        // System.out.println(a);
        // final int b = 500;
        // b = 600; // It will throw an error because we made the b variable as constant or using the final keyword. So this variable's value cannot be changed.
        // System.out.println(b);

        // Adding
        // System.out.println("Nahid Hasan " + "Limon");
        // System.out.println(100 + 500);

        // Declaring Many Variables Of Same Type At A Time
        // int a = 12, b = 20, c = 30;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        
        // Scientific Numbers
        // System.out.println(3.5E5d);
        // System.out.println(87E5);
        // System.out.println(0.5454764E5);



        // Type Casting In Java
        // Types Sequence
        // byte -> short -> char -> int -> long -> float -> double
        // Widening Casting (Converting a smaller type to a larger type size)
        // int a = 55;
        // System.out.println(a); // 55
        // double d = a;
        // System.out.println(d); // 55.0

        // Narrowing Casting (converting a larger type to a smaller type size)
        // float f = 3.2f;
        // f = (int) f;
        // System.out.println(f); // 3.0

        

        // Strings In Java
        // String greeting = "Hello";
        // System.out.println(greeting.length());

        // More String Methods
        // System.out.println(greeting.toUpperCase());
        // System.out.println(greeting.toLowerCase());
        // System.out.println(greeting.indexOf("e"));
        // System.out.println(greeting.charAt(4));
        // System.out.println("Limon".indexOf("N")); // -1, Because N is not exist in Limon
        // System.out.println("George".indexOf("G")); // 0
        // System.out.println("Hasan".charAt(2)); // s

        // String concatenation
        // System.out.println("Hello" + " " + "Guys");
        // Also we can use the concat() method
        // String a = "Nahid Hasan";
        // System.out.println(a.concat(" Limon"));
        // System.out.println("Hello".concat(" Friends!"));

        // NOTE HERE:
        // System.out.println("Hello " + "Limon"); // Hello Limon
        // System.out.println(12 + 23); // 32
        // System.out.println("Limon" + 100); // Limon100
        // System.out.println(25 + 5 + "Limon"); // 30Limon
        // So, the thing I would say is:
        // In java, str + str = str concatenation
        // int + int = int -> Addition
        // str + int / int + str = str concatenation

        // Special Characters
        // System.out.println("'Limon is here'");
        // System.out.println("\"Limon\"");
        // System.out.println("Nahid Hasan\nLimon");
        // System.out.println("This is a\ttab space");
        // System.out.println("Choose one\\two");

        

        // Java Math
        // System.out.println(Math.max(100,1200));
        // System.out.println(Math.min(40,20));
        // System.out.println(Math.sqrt(144)); // 12.0
        // System.out.println(Math.cbrt(27)); // 3.0
        // System.out.println(Math.abs(-968)); // 968
        // System.out.println(Math.random());
        // System.out.println(Math.ceil(3.6));
        // System.out.println(Math.ceil(3.5));
        // System.out.println(Math.ceil(3.3));
        // System.out.println(Math.floor(3.3));
        // System.out.println(Math.floor(3.9));
        // System.out.println(Math.round(3.5));
        // System.out.println(Math.round(3.7));
        // System.out.println(Math.round(3.1));
        // Note: The Math.round() will give us integer value and the others give us float value
        // --
        // Printing different number from 0 - 100 at different times
        // System.out.println(Math.round(Math.random() * 100));
        // Also we can use this system to do the same thing:
        // int randomNum = (int)(Math.random() * 101);  // 0 to 100
        // System.out.println(randomNum);



        // Java Boolean
        // System.out.println(true);
        // System.out.println(false);
        // boolean compare = 100 < 100;
        // System.out.println(compare);
        // System.out.println(20 > 10);



        // Java if....else if....else
        // int num = 0;
        // if (num >= 80 && num <= 100){
        //     System.out.println("You have got A+");
        // }
        // else if (num >= 70 && num < 80){
        //     System.out.println("You have got A");
        // }
        // else if (num >= 40 && num < 70){
        //     System.out.println("You have passed");
        // }
        // else if (num >= 0 && num < 40){
        //     System.out.println("You have failed");
        // }
        // else{
        //     System.out.println("Invalid Number! Try Again....");
        // }

        // Short Hand If...Else (Ternary Operator)
        // String x = (100 > 200) ? "Okay Cool" : "Not so cool";
        // System.out.println(x);
        // System.out.println("Limon" == "Limon" ? "Limon is nice" : "Limon is bad");



        // Java switch....case....break
        // String day = "monday";
        // switch (day){
        //     case "monday":
        //     System.out.println("Today is monday");
        //     break;
        //     case "friday":
        //     System.out.println("Today is friday");
        //     break;
        //     case "sunday":
        //     System.out.println("Today is sunday");
        //     break;
        //     default:
        //     System.out.println("Others");
        // }



        // Java loops
        // while loop
        // int a = 1;
        // while (a <= 100){
        //     System.out.println(a);
        //     a++;
        // }

        // for loop
        // for (int i = 0; i <= 10; i++){
        //     System.out.println(i);
        // }

        // do...while loop
        // int p = 12;
        // do{
        //     System.err.println(p);
        //     p++;
        // } while (p <= 20);

        // for...each loop
        // int[] nums = {1,2,3,4,5,6,7,8,9,10};
        // String[] names = {"Limon", "Rimon", "Abbu", "Ammu"};
        // for (int num : nums){
        //     System.out.println(num);
        // }
        // for (String name : names){
        //     System.out.println();
        // }
        // double[] db = {2.3,4.5,23.6,5.9,8.8};
        // for (double d : db){
        //     System.out.println(d);
        // }



        // Java break...continue

        // int a = 12;
        // while (a <= 20){
        //     if(a == 15){
        //         a++;
        //         continue;
        //     }
        //     else{
        //         System.out.println(a);
        //     }
        //     a++;
        // }
        
        // int x = 0;
        // while (x <= 10){
        //     x++;
        //     if (x == 6){
        //         continue;
        //     }
        //     else{
        //         System.out.println(x);
        //     }
        // }


        // for (int i = 1; i <= 15; i++){
        //     if (i == 4){
                // break;
            //     continue;
            // }
            // else{
            //     System.out.println(i);
            // }
        // }

        // continue in do while loop
        // int p = 1;
        // do {
        //     if (p == 5){
        //         p++;
        //         continue;
        //     }
        //     else{
        //         System.out.println(p);
        //         p++;
        //     }
        // } while (p <= 20);



        // Java Arrays
        // String[] a = {"Limon", "Abit", "Tahisant", "Oyajed"};
        // Access the Elements of an Array
        // System.out.println(a[1]);
        // System.out.println(a[2]);

        // Change an Array Element
        // a[1] = "Rimon";
        // System.out.println(a[1]);

        // Array Length
        // System.out.println(a.length);
        // int[] nums = {1,2,3,4,5,7,6,7,9,9,25,63};
        // System.out.println(nums.length);

        // Loop Through an Array
        // for (int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }
        // for (int x = 0; x < a.length; x++){
        //     System.out.println(a[x]);
        // }

        // Loop through an array using for...each
        // for (int num : nums){
        //     System.out.println(num);
        // }

        // for (String name : a){
        //     System.out.println(name);
        // }


        // Multidimensional Arrays
        // int[][] aa = {{1,2,3,4,5,6}, {10,20,30,40,200,500,63,969,100,3000}};
        // System.out.println(aa[0][3]); 
        // System.out.println(aa[1][3]);

        // int[][][] bb = {
        //     {
        //         {10,20,30}
        //     },
        //     {
        //         {1,2,3,4,5,}, {10,200,300}
        //     }
        // }; 
        // System.out.println(bb[0][0][1]);
        // System.out.println(bb[1][1][2]);

        // Loop through over a multi-dimensional array
        // for (int a = 0; a < aa.length; a++){
        //     for (int b = 0; b < aa[a].length; b++ ){
        //         System.out.println(aa[a][b]);
        //     }
        // }



        // Practicing Access Modifiers
        // ----------------------------

        // Constructor obj = new Constructor(); // Because of being a public class, the Constructor class is accessible here. :) Also, the attributes/ methods should be public to access from here.
        // System.out.println(obj.gpa);
        // System.out.println(obj.roll);
        // ---
        // Modifiers mod = new Modifiers(); // Because of being a default class, the Modifiers class is not accessible here. :)


        // System.out.println(myint); // Not accessible. Because myint is an attribute of a class, so if we want to use it, we need to use that class's object. If that class is public then we can access otherwise not.

        
        // Constructor cot = new Constructor();
        // System.out.println(cot.nm);
        // System.out.println(cot.roll);
        // System.out.println(cot.gpa);
        // System.out.println(cot.p); // p attribute is not accessible from here, because on the Constructor class, we set p as a default attribute, and default attributes can get accessed only from the main class where it is created and the other classes of the same package. :)

        // Trying to access private methods/ attributes
        // System.out.println(cot.nm); // accessible because nm is a public attr.
        // System.out.println(cot.p); // reason was given up.
        // System.out.println(cot.email); // email is a private attr.
        // cot.my(); // my() is a private method
    }
}