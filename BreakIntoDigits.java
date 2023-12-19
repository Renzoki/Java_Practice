import java.util.Scanner;

//Program that displays the individual digits of a number of any size within the range of possible int numbers
public class BreakIntoDigits {
    public static void main(String[] Args){
        String string;
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number: ");
        number = scan.nextInt();
        string = Integer.toString(number);  //Convert int to string

        for(int i = 0; i < string.length(); i++){
            System.out.println("The digit at position " + i + " is " + string.charAt(i)+ "."); //Print each digit at i
        }
    }
}
