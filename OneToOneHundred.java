import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Program that creates a new text file and prints 1 to 100 in it
public class OneToOneHundred {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("1 to 100.txt"));

        int[] A = new int[100];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }

        for(int n : A)
            writer.write(n + "\n");


        writer.close();
    }
}
