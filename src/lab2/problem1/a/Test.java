package lab2.problem1.a;

public class Test {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3.0, 5.0);
        Shape3D sphere = new Shere(4.0);
        Shape3D cube = new Cube(2.0);

        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(cube);
    }
}
