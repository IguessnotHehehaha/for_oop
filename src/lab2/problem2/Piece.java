package lab2.problem2;

public abstract class Piece {
    protected Position position;
    protected String color;

    public Piece(Position position, String color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }
    public String getColor() { return color; }

    public abstract boolean isLegalMove(Position target);
    public abstract String getName();

    @Override
    public String toString() {
        return color + " " + getName() + " at " + position;
    }
}
