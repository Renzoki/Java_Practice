package PracticeExercise1;

public class Average {
    private float Ave = 0;
    float[] A;

    public Average(float[] A){
        this.A = A;
    }

    public float getAverage(){
        for(float f : A)
            Ave += f;

        Ave /= A.length;

        return Ave;
    }
}
