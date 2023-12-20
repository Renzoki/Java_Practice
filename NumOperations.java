import java.util.Scanner;
import java.lang.Math;

//Program that does some random operations on 2 integers
public class NumOperations {
    public static void main(String[] Args){
        int A, B; //A and B are 2 user input integers

        Scanner scan = new Scanner(System.in);

        System.out.print("Input first integer: ");
        A = scan.nextInt();
        System.out.print("Input second integer ");
        B = scan.nextInt();

        System.out.println("\nThe sum of " + A + " and " + B + " is equal to " + (A + B));
        System.out.println("The difference of " + A + " and " + B + " is equal to " + (A - B));
        System.out.println("The product of " + A + " and " + B + " is equal to " + (A * B));
        System.out.println("The quotient of " + A + " and " + B + " is equal to " + (A / B));
        System.out.println("The average of " + A + " and " + B + " is equal to " + (A + B) / 2);
        System.out.println("The distance of " + A + " and " + B + " is equal to " + (A - B));
        System.out.println("Maximum integer: " + Math.max(A, B));
        System.out.println("Minimum integer: " + Math.min(A, B));
    }
}
