package basics;

/*
Explanation:
Like any other method, main method can also be overloaded.
But main method called by JVM is always with String [] parameter.
Don't get confused with 10 as it is passed as "10".
Run above class with any command line arguments or 0 command line argument, output will always be ONE.
 */

//java Test5 10
public class Test5 {

    public static void main(String[] args) {
        System.out.println("ONE");
    }

    public static void main(Integer[] args) {
        System.out.println("TWO");
    }

    public static void main(byte [] args) {
        System.out.println("THREE");
    }

}
