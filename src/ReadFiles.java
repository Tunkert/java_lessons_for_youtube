import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File myFBFile = new File("fizzbuzz.txt");
        Scanner readFBFile = new Scanner(myFBFile);
        while (readFBFile.hasNextLine()) {
            String currentLine = readFBFile.nextLine();
            System.out.println(currentLine);
        } // probably should use a try catch here
    }
}

// to delete a file use myFBFile.delete()