public class TheMathClass {
    public static void main(String[] args) {
        // min and max of two numbers
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));
        // square roots
        System.out.println(Math.sqrt(9));
        // distance from zero on the number line
        System.out.println(Math.abs(-10));
        // some trig
        System.out.println(Math.cos(Math.PI / 4));
        System.out.println(Math.sin(Math.PI / 4));
        System.out.println(Math.tan(Math.PI / 4));
        // random number between 0.0 and 0.999999999999999999 (inclusive)
        System.out.println(Math.random());
        // random number between 1 and 10 - notice the type casting
        System.out.println((int)(Math.random() * 11));
    }
}
