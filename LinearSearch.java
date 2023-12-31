public class LinearSearch {
    private int[][] A;

    public LinearSearch(int[][] A, int length, int width){
        this.A = new int[length][width];

        for(int i = 0; i < length; i++)
            for(int j = 0; j < width; j++)
                this.A[i][j] = A[i][j];
    }

    public void doSearch(int length, int width, int key){
        int flag = 0;
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (key == A[i][j]) {
                    System.out.print("\nLINEAR SEARCH: KEY IS FOUND ON A[" + i + "][" + j + "].");
                    flag++;
                }
            }
        }

        if (flag == 0)
            System.out.print("\nKEY IS NOT IN THE ARRAY.");
    }
}
