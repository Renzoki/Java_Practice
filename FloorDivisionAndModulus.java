import java.util.Scanner;
import java.lang.Math;

//Program that calculates the result of floor division and modulo of 2 double values
public class FloorDivisionAndModulus {
    public static void main(String[] Args){
        double A, B;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input dividend: ");
        A = scan.nextDouble();
        System.out.print("Input divisor: ");
        B = scan.nextDouble();

        System.out.println("\nThe floor quotient is " + Math.floor(A / B));
        System.out.println("The floor remainder is " + Math.floor(A % B));

    }
}
