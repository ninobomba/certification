package basics.main;

/*
Explanation

Special main method (called by JVM on execution)
    =>   should be static and
    should have public access modifier.
    It also takes argument of String [] type (Varargs syntax String... can also be used).

String [] or String... argument can use any identifier name, even though in most of the cases you will see "args" is used.

final modifier can be used with this special main method.

Hence, from the given five definitions of main method, below two definitions will print expected output on to the console.

public static final void main(String... a) {System.out.println("Java Rocks!");}
and
public static void main(String [] args) {System.out.println("Java Rocks!");}
 */

public class Test6 {

    //public static void main(String [] args) { System.out.println("Java Rocks!"); }
    //public static final void main(String... a) { System.out.println("Java Rocks!"); }

    //not static
    //public void main(String... args) { System.out.println("Java Rocks!"); }
    //static void main(String [] args) { System.out.println("Java Rocks!"); }
    //public static void main(String args) { System.out.println("Java Rocks!"); }

}
