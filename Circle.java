//Encapsulation Practice
public class Circle {
    private double radius;
    private final double PI = 3.14d;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return 2 * (PI * radius);
    }

    public double getArea(){
        return PI * (radius * radius);
    }
}
