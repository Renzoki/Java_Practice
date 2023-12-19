import java.util.Scanner;

//Program that calculates for BMI based on weight (pounds) and height (inches)
public class CalculateBMI {
    public static void main(String[] Args){
        double pounds, inches;
        double BMI;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        pounds = scan.nextDouble();
        System.out.print("Input height in inches: ");
        inches = scan.nextDouble();

        BMI = (pounds / (inches * inches)) * 703;

        System.out.println("\nBody Mass Index = " + BMI);
    }
}
