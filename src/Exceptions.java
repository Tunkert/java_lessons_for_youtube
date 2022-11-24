import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myInt;
        System.out.println("Enter an integer.");
        try {
            myInt = scan.nextInt();
            System.out.println("The integer you entered is " + myInt + ".");
        } catch(Exception e) {
            System.out.println("I said enter an integer, bro.");
        } finally {
            System.out.println("Well, cool, bro.");
        }
    }
}
