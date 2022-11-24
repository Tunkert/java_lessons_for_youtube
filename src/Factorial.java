public class Factorial {
    public static void main(String[] args) {
        // create a factorial function that uses recursion
        System.out.println(recursion(5));
    }

    public static int recursion(int num) {
        if (num == 1) {
            return num;
        }
        return recursion(num - 1) * num;
    }
}
