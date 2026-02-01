public class StarTriangle{
    private final int width;

    public StarTriangle(int width) {
        if (width <1) {
            throw new IllegalArgumentException("width must be at least 1");
        }
        this.width = width;
    }

    @Override public String toString() {
        StringBuilder triangle = new StringBuilder();
        for (int row =1; row <= width; row++) {
            for (int col =0; col < row; col++) {
                triangle.append("[*]");
            }
            if (row < width) {
                triangle.append('\n');
            }
        }
        return triangle.toString();
    }
}
