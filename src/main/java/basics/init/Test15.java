package basics;

/*
Explanation

name, height, result and age are instance variables of Student class. And instance variables are initialized to their respective default values.
name is initialized to null, age to 0, result to false and height to 0.0.
Statement System.out.println(stud.name + stud.height + stud.result + stud.age); prints null0.0false0
 */

class Student {
    String name;
    int age;
    boolean result;
    double height;
}

public class Test15 {

    public static void main(String[] args) {
        Student stud = new Student();
        System.out.println(stud.name + stud.height + stud.result + stud.age);
    }

}
