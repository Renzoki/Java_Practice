public class Average {
    private int[][] A;
    private int i, j;

    public Average(int[][] A, int length, int width){
        this.A = new int[length][width];
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                this.A[i][j] = A[i][j];
            }
        }
    }

    public int getAverage(int length, int width){
        int sum = 0;
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                sum += A[i][j];
            }
        }
        sum /= (length * width);
        return sum;
    }

}
