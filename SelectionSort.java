public class SelectionSort {
    private int[][] A;

    public SelectionSort(int[][] A, int length, int width){
        this.A = new int[length][width];
        for(int i = 0; i < length; i++)
            for(int j = 0; j < width; j++)
                this.A[i][j] = A[i][j];
    }

    public int[][] sortArray(int length, int width){
        int i, j, k, min;

        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                min = j;
                for(k = j + 1; k < width; k++){
                    if(A[i][k] < A[i][min]){
                        min = k;
                    }
                }

                if(min != j){
                    Swap(A, i, j, min);
                }
            }
        }

        return A;
    }

    private void Swap(int[][] A, int i, int j, int min){
        int tempVal = A[i][j];
        A[i][j] = A[i][min];
        A[i][min] = tempVal;
    }


}
