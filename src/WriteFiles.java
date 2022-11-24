import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) throws IOException {
        FileWriter myFizzBuzzFile = new FileWriter("fizzbuzz.txt");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                myFizzBuzzFile.write("Fizzbuzz\n");
            } else if (i % 3 == 0) {
                myFizzBuzzFile.write("Fizz\n");
            } else if (i % 5 == 0) {
                myFizzBuzzFile.write("Buzz\n");
            } else {
                myFizzBuzzFile.write(Integer.toString(i));
                myFizzBuzzFile.write("\n");
            }
        }
        myFizzBuzzFile.close();
    }
}
