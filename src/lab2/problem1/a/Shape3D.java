package lab2.problem1.a;

public abstract class Shape3D {
    public abstract double volume();
    public abstract double surfaceArea();

    @Override
    public String toString(){
        return getClass().getSimpleName() +
                " [volume=" + String.format("%.2f", volume()) +
                ", surfaceArea=" + String.format("%.2f", surfaceArea()) + "]";
    }
}
