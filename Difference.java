public class Difference {
    private int[][] A; //2D array "A"
    private int Dif = 0;

    public Difference(int length, int width){
        this.A = new int[length][width];
        int i, j;
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
