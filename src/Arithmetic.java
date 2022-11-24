public class Arithmetic {
    public static void main(String[] args) {
        // declare and initialize two integers in the same statement
        int a = 10, b = 3;
        // add the two numbers (and print)
        System.out.println(a + b);
        // subtract the two numbers (and print)
        System.out.println(a - b);
        // multiply the two numbers (and print)
        System.out.println(a * b);
        // divide the two numbers (and print)
        System.out.println(a / b); // notice we get 3 here
        System.out.println(10 / 3.0); // result is a float
        System.out.println(10.0 / 3); // result is a float
        System.out.println(10.0 / 3.0); // result is a float
        // find the remainder of division - this is the modulo operator
        System.out.println(a % b); // 1
//        increment the number by 1 ... after
        System.out.println(a++); //
//        increment the number by 1 ... before
        System.out.println(++a);
//        decrement the number by 1 ... after
        System.out.println(a--);
        // decrement the number after
        System.out.println(--a);
    }
}
