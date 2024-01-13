package PracticeExercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;

        System.out.print("Input number of float values: ");
        length = sc.nextInt();
        System.out.println("----------");
        float[] A = new float[length];
        for (int i = 0; i < length; i++) {
            A[i] = sc.nextFloat();
        }
        System.out.println("----------");

        Average Ave = new Average(A);
        StandardDeviation SD = new StandardDeviation(A, Ave);
        System.out.printf("Avg: %.2f", Ave.getAverage());
        System.out.printf("\nStd: %.2f", SD.getStandardDeviation());
    }
}
