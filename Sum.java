public class Sum {
    private int Sum = 0;

    public Sum(int[][] A, int length, int width){
        //2D array "A"
        int i, j;
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                Sum += A[i][j];
            }
        }
    }

    public int getSum(){
        return Sum;
    }
}
