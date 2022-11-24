public class WhileLoops {
    public static void main(String[] args) {
        int i = 1;
        // let's do Fizzbuzz ... (not again ...)
        while (i < 101) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++; // make sure to increment i by one each time through the loop.
        }
    }
}
