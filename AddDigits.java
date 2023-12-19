import java.util.Scanner;

//Program that displays each digit in a 3-digit number
public class AddDigits {
    public static void main(String[] Args){
        int num;
        int[] digits = new int[3];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number between 0 and 1000: ");
        num = scan.nextInt();

        digits[0] =  num / 100;
        digits[1] =  num / 10 % 10;
        digits[2] =  num % 10;

        for(int i = 0; i < 3; i++){
            System.out.println("Digit number " + i + " is " + digits[i] + ".");
        }
    }
}
