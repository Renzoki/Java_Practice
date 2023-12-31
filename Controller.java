import java.util.Scanner;
import java.util.Random;

public class Controller {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int i, j;

        System.out.println("Note: 2D Array will be filled with random values.");

        System.out.print("Input Array height: ");
        int length = scan.nextInt();
        System.out.print("Input Array width: ");
        int width = scan.nextInt();

        System.out.println("""
                \nChoose Algorithm to run:\s
                1 - Minimum
                2 - Maximum
                3 - Average
                4 - Sum
                5 - Difference
                6 - Selection Sort
                7 - Linear Search
                8 - Binary Search""");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();

        int[][] A = new int[length][width];   //Initialize 2D array

        for(i = 0; i < length; i++)
            for(j = 0; j < width; j++)
                A[i][j] = rand.nextInt(1000);

        System.out.println("\nARRAY: ");
        DisplayFunction(A, length, width);

        if(choice == 1) {
            Minimum min = new Minimum(A, length, width);
            System.out.println("\nMINIMUM: " + min.getMinimum(length, width));
        } else if (choice == 2) {
            Maximum max = new Maximum(A, length, width);
            System.out.println("\nMAXIMUM: " + max.getMaximum(length, width));
        } else if (choice == 3) {
            Average ave = new Average(A, length, width);
            System.out.println("\nAVERAGE: " + ave.getAverage(length, width));
        } else if (choice == 4) {
            Sum sum = new Sum(A, length, width);
            System.out.println("\nSUM: " + sum.getSum());
        } else if (choice == 5) {
            Difference dif = new Difference(length, width);
            System.out.println("\nDIFFERENCE: " + dif.getDif());
        } else if (choice == 6) {
            SelectionSort SelSort = new SelectionSort(A, length, width);
            System.out.println("\nSORTED ARRAY: ");
            DisplayFunction(SelSort.sortArray(length, width), length, width);
        } else if (choice == 7) {
            LinearSearch LinSer = new LinearSearch(A, length, width);
            System.out.print("\nInput key: ");
            int key = scan.nextInt();
            LinSer.doSearch(length, width, key);
        } /*else if (choice == 8) {

        } */
    }

    public static void DisplayFunction(int[][] A, int length, int width){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.printf("%-4d ", A[i][j]);
            }
            System.out.println(" ");
        }
    }
}
