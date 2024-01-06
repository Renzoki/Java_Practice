import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Program that counts the number of characters in a text file
public class CountCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("1 to 100.txt"));
        String line;
        int NumOfChar = 0;

        while((line = reader.readLine()) != null)
            NumOfChar += line.length();

        System.out.println(NumOfChar);
    }
}
