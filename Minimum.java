public class Minimum {
    private final int[][] A; //2D array "A"
    private int i, j;

    public Minimum(int[][] A, int length, int width){
        this.A = new int[length][width];
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                this.A[i][j] = A[i][j];
            }
        }
    }

    public int getMinimum(int length, int width){
        int min = Integer.MAX_VALUE;
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                if(A[i][j] < min)
                    min = A[i][j];
            }
        }

        return min;
    }

}
