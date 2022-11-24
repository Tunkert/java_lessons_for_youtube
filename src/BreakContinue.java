public class BreakContinue {
    public static void main(String[] args) {
        // print 1 through 7
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 7)
                break;
        }
        System.out.println("+++++++++++");
        // print 1 through 10, skipping 7
        for (int i = 1; i <= 10; i++) {
            if (i == 7)
                continue;
            System.out.println(i);
        }
    }
}
