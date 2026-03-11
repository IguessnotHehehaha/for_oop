package lab2.problem1.a;

public class Shere extends Shape3D{
    private double radius;

    public Shere(double radius){
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
