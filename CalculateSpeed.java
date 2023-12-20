import java.util.Scanner;

//Program that calculates the speed in meters per second, kilometers per hour, and miles per hour given distance in meters, hours, minutes, and seconds

public class CalculateSpeed {
    public static void main(String[] Args){
        double second, minute, hour;
        double distance;

        Scanner scan = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        distance = scan.nextDouble();
        System.out.print("Input hours: ");
        hour = scan.nextDouble();
        System.out.print("Input minutes: ");
        minute = scan.nextDouble();
        System.out.print("Input seconds: ");
        second = scan.nextDouble();
        scan.close();

        double metersPerSec = distance / (second + (minute * 60) + (hour * 60 * 60));
        System.out.println("Your speed in meters/second is " + metersPerSec);

        double kilometersPerHour = (distance / 1000) / (hour + (minute / 60) + (second / 60 / 60));
        System.out.println("Your speed in km/h is " + kilometersPerHour);

        double milesPerHour = (distance / 1609.344) / (hour + (minute / 60) + (second / 60 / 60));
        System.out.println("Your speed in mp/h is " + milesPerHour);
    }
}
