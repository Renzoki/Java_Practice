import java.util.Scanner;

//Program taht converts minutes to its corresponding amount in years and days
public class MinutesToYears {
    public static void main(String[] Args){
        int minutes;
        int years, days;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        minutes = scan.nextInt();

        years = minutes / 60 / 24 / 365;
        days = minutes / 60 / 24 % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
