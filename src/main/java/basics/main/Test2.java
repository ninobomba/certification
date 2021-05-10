package basics;

//java Guest Clare Waight Keller
/*
Explanation:s
    Class Test2 has special main method but main method defined in Message class is not public and hence it can't be called by JVM.
    But there is no issue with the syntax hence no compilation error.
    java Test2 Clare Waight Keller passes new String [] {"Clare", "Waight", "Keller"} to args of Test.main method.
    Test2.main method invokes Message.main method with the same argument: new String [] {"Clare", "Waight", "Keller"}.
    args[2] is "Keller" hence "Welcome Keller!" gets printed on to the console.
 */

public class Test2 {
    public static void main(String [] args) {
        Message.main(args);
    }
}

class Message {
    static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}