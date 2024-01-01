public class Maximum {
    private final int[][] A; //2D array "A"
    private int i, j;

    public Maximum(int[][] A, int length, int width){
        this.A = new int[length][width];
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                this.A[i][j] = A[i][j];
            }
        }
    }

    public int getMaximum(int length, int width){
        int max = 0;
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                if(A[i][j] > max)
                    max = A[i][j];
            }
        }

        return max;
    }

}
