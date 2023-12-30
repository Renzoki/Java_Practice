public class Difference {
    private int[][] A; //2D array "A"
    private int i, j;
    private int Dif = 0;

    public Difference(int[][] A, int length, int width){
        this.A = new int[length][width];
        for(i = 0; i < length; i++){
            for(j = 0; j < width; j++){
                Dif -= A[i][j];
            }
        }
    }

    public int getDif(){
        return Dif;
    }
}
