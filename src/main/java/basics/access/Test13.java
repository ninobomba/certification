package basics.access;

public class Test13 {

    /*
    // Planet.java
    package com.udayankhattry.galaxy;
    public class Planet {
        String name;
        public Planet(String name) {this.name = name;}
        public String toString() { return "Planet: " + name;}
    }

    // Creator.java
    package com.udayankhattry.oca;
    public class Creator { public static Planet create() {return new Planet("Earth");} }

    // TestCreator.java
    package com.udayankhattry.oca.test;
    public class TestCreator { public static void main(String[] args) { System.out.println(Creator.create());}}

    And below options:

        1.
        Add below import statement in Creator.java file:
        import com.udayankhattry.galaxy.Planet;

        2.
        Add below import statement in Creator.java file:
        import com.udayankhattry.oca.test.TestCreator;

        3.
        Add below import statement in TestCreator.java file:
        import com.udayankhattry.oca.Creator;

        4.
        Add below import statement in TestCreator.java file:
        import com.udayankhattry.galaxy.Planet;
        Which of the above options needs to be done so that on executing TestCreator class, "Planet: Earth" is printed on to the console?

    Please note: Unnecessary imports are not allowed.

    1 and 3

Explanation

Planet is defined in 'com.udayankhattry.galaxy' package, Creator is defined in 'com.udayankhattry.oca' package and TestCreator is defined in 'com.udayankhattry.oca.test' package.
Planet class doesn't mention 'Creator' or 'TestCreator' and hence no import statements are needed in Planet class.
Creator class uses the name 'Planet' in its code and hence Creator class needs to import Planet class
    using 'import com.udayankhattry.galaxy.Planet;' statement
    or 'import com.udayankhattry.galaxy.*;' statement.
TestCreator class uses the name 'Creator' in its code and hence TestCreator class needs to import Creator class
    using 'import com.udayankhattry.oca.Creator;' statement or 'import com.udayankhattry.oca.*;' statement.

Please note, even though in TestCreator class, `Creator.create()` returns an instance of Planet class but as name 'Planet' is not used, hence Planet class is not needed to be imported.
Planet class correctly overrides toString() method, hence when an instance of Planet class is passed to println(...) method, as in the below statement:
System.out.println(Creator.create());
toString() method defined in the Planet class is invoked, which print "Planet: Earth" on to the console.

    */



}
