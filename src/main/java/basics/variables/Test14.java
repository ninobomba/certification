package basics.variables;

/*
Explanation

127 + 21 = 148 = 00000000 00000000 00000000 10010100
Above binary number is positive, as left most bit is 0.
Same binary number after type-casting to byte: 10010100, negative number as left most bit is 1.
10010100 = -108.
 */

public class Test14 {

    public static void main(String[] args) {
        byte b1 = (byte) (127 + 21);
        System.out.println(b1);
    }
}
