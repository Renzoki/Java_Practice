import java.util.Scanner;

//Program that converts inches to meters
public class InchesToMeters {
    public static void main (String[] Args){
        double inch;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input measurement in inches: ");
        inch = scan.nextDouble();

        System.out.printf("%.1f inches is equal to %.3f meters.", inch, inch * 0.0254);
    }
}
