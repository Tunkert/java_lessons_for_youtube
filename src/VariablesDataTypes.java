public class VariablesDataTypes {
    public static void main(String[] args) {
        /*
        You can create variables of different data types
        Java is a statically typed language
        Some main data types are below
        The convention is to have variable names in camelCase
        variable names are sometimes called identifiers
         */
        String myName = "Timothy Unkert";
        int myAge = 46;
        float pi = 3.14f; // must include the f for float
        double pi2 = 3.1415;
        char myGrade = 'A'; // note I put this in single quotes
        boolean isTeacher = true;
        // we can print variables
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(myGrade);
        System.out.println(isTeacher);
        // we can declare multiple variables
        int a = 1, b = 2, c = 3;
        System.out.printf("%d %d %d\n", a, b, c); // we can use System.out.printf similar to printf in C
        /*
        other data types include byte, short, int, long, float, double, boolean, char
         */
    }
}
