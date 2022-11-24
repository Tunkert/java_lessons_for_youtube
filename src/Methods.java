public class Methods {
    public static void main(String[] args) {
        // call square function
        square(3); // notice we need to print what we call
        System.out.println(square(3));
        hello();
        System.out.println(exponent(2, 3));
    }

    public static int square(int num) {
        return num * num;
    }

    public static void hello() {
        System.out.println("Hello, my name is Tim.");
    }

    public static int exponent(int base, int power) {
        int i = 0;
        int product = 1;
        while (i < power) {
            product = product * base;
            i++;
        }
        return product;
    }
}
