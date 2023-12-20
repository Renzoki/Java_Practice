import java.util.Scanner;
import java.lang.Math;

//Program that calculates the square, cube, and fourth power of a given number
public class NumPowers {
    public static void main(String[] Args){
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        num = scan.nextInt();

        System.out.println("Square: " + Math.pow(num, 2));
        System.out.println("Cube: " + Math.pow(num, 3));
        System.out.println("Fourth Power: " + Math.pow(num, 4));
    }
}
