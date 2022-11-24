public class TypeCasting {
    public static void main(String[] args) {
        // declare and initialize variables
        String myName = "Timothy Unkert";
        int myAge = 46;
        // print out both ...
        System.out.println("My name is " + myName + " and I am " + myAge + " years old.");
        /*
        The example above is of string concatenation
         */
        // other examples
        double pi = 3.1415;
        int piInt = (int) pi; // chops off the decimal
        System.out.println(piInt);
    }
}
