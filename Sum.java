public class Sum {
    private int[][] A; //2D array "A"
    private int Sum = 0;

    public Sum(int[][] A, int length, int width){
        this.A = new int[length][width];
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
