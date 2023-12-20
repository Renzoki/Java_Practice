import java.util.Scanner;
import java.lang.Double;

//Program that determines whether a given floating point value is finite or infinite
public class FiniteOrInfinite {
    public static void main(String[] Args){
        double testVal;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input floating point value: ");
        testVal = scan.nextDouble();

        if(Double.isInfinite(testVal)){
            System.out.println("\nThe given value is infinite.");
        }
        else{
            System.out.println("\nThe given value is finite.");
        }
    }
}
