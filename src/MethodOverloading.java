public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(exponent(2, 3));
        System.out.println(exponent(2.2, 5));
    }

    public static int exponent(int base, int power) {
        int i = 0;
        int product = 1; // this product isn't the same one as below .. scope and all
        while (i < power) {
            product *= base;
            i = i + 1;
        }
        return product;
    }

    public static double exponent(double base, int power) {
        int i = 0;
        double product = 1;
        while (i < power) {
            product *= base;
            i++;
        }
        return product;
    }
}
