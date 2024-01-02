public class TriangleAreaPerimeter1 {
    private int height, base;

    //3 Sides needed for Perimeter and Area
    public TriangleAreaPerimeter1(int height, int base){
        this.height = height;
        this.base = base;
    }

    //Method to get Perimeter
    public int getPerimeter(){
        return base + (height * 2);
    }

    //Method to get Area
    public int getArea(){
        return (base * height) / 2;
    }
}
