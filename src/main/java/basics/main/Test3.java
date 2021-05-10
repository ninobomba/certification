package basics.main;

/*
Explanation:
    As System.out.println needs to be executed on executing the Test class, this means special main method should replace INSERT.
    Special main method's name
        should be "main" (all characters in lower case),
        should be static,
        should have public access specifier
        and it accepts argument of String [] type.
    String [] argument can use any identifier name, even though in most of the cases you will see "args" is used.
    Position of static and public can be changed but return type must come just before the method name.
 */

public class Test3 {

    /*INSERT*/ {
        System.out.println("Hurrah! I passed...");
    }

    // 1) public static void main(String[] args)
    // 2) static public void main(String[] a )
}
