package PracticeExercise1;

public class StandardDeviation {
    private float StandardDev = 0;
    float[] A;
    Average B;

    public StandardDeviation(float[] A, Average B){
        this.A = A;
        this.B = B;
    }

    public float getStandardDeviation(){
        for (int i = 0; i < A.length; i++) {
            StandardDev += ((A[i] - B.getAverage()) * (A[i] - B.getAverage()));
        }

        StandardDev = (StandardDev / A.length);
        StandardDev = (float) Math.sqrt(StandardDev);
        for (int i = A.length - 1; i >= 0; i--) {
            float v = A[i];
            
        }
        return StandardDev;
    }
}
