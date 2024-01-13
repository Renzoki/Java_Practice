package SortingAlgorithms;

public class SelectionSort {
    private final int[] A;

    //Initializes Array Values
    public SelectionSort(int[] A){
        this.A = A;
    }

    //Sorts the Array
    public int[] Sort(int[] A){
        for (int i = 0; i < A.length; i++) {
            int min = i;
            for (int j = i + 1; j <= A.length - 1; j++) {
                if(A[j] < A[min])
                    min = j;
            }

            if(min != i)
                Swap(i, min);
        }

        return A;
    }

    //Swapping method
    private void Swap(int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //Prints the Array
    public void PrintArray(){
        for(int num : A)
            System.out.print(num + " ");
        System.out.println("\n");
    }

}
