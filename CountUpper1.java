public class CountUpper1 {
    char[] B;
    public CountUpper1(char[] A, int length){
        B = new char[length];
        System.arraycopy(A, 0, B, 0, A.length);
    }
    
    public int getAmtOfUpper(){
        int amt = 0;

        for(int i = 0; i < B.length; i++){
            if((int)B[i] >= 65 && (int)B[i] <= 90)
                amt++;
        }

        return amt;
    }
}
