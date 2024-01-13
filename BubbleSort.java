package SortingAlgorithms;

public class BubbleSort {
    private int[] A;

    //Initialize Array
    public BubbleSort(int[] A){
        this.A = A;
    }

    //Bubble Sort
    public int[] Sort(){
        int length = A.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length  - i - 1; j++) {
                if (A[j] > A[j + 1])
                    Swap(j, j + 1);
            }
        }

        return A;
    }

    //Method for swapping
    private void Swap(int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //PMethod for printing the array
    public void PrintArray(){
        for(int num : A)
            System.out.print(num + " ");
        System.out.println("\n");
    }
}
