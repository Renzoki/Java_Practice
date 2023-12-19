import java.util.Scanner;

//Program that converts Celsius to Fahrenheit and vice versa
public class CFconversion {
    public static void main(String[] Args){
        double temp;
        byte choice; //For user input;
        Scanner scan = new Scanner(System.in); //Declare new Scanner object

        System.out.println("1 - Fahrenheit to Celsius\n2 - Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        choice = scan.nextByte();

        System.out.println("\nInput temperature: ");
        temp = scan.nextDouble();
        //Close input because it will start inputting random decimals (I think)

        System.out.print("\nYour converted temperature is ");
        if(choice == 2){
            temp = (temp * 9/5) + 32; //C to F
            System.out.printf("%.2f Celsius.", temp); //Used printf to format temp up to 2 decimal places only
        }
        else{
            temp = (temp - 32) * 5/9; //F to C
            System.out.printf("%.2f Fahrenheit.", temp);
        }
    }
}

