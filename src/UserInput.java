import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yourName;
        System.out.println("What is your name? ");
        yourName = scan.nextLine();
        System.out.println("Your name is " + yourName + "!");
        System.out.println("What is your age? ");
        int age = scan.nextInt();
        System.out.println("Your age is " + Integer.toString(age) + "!");
    }
}
