package lab2.problem2;

public class Pawn extends Piece {
    private boolean hasMoved;

    public Pawn(Position position, String color) {
        super(position, color);
        this.hasMoved = false;
    }

    public void setHasMoved(boolean hasMoved) { this.hasMoved = hasMoved; }

    @Override
    public boolean isLegalMove(Position target) {
        if (!target.isValid()) return false;
        int rowDiff = target.getRow() - position.getRow();
        int colDiff = Math.abs(target.getCol() - position.getCol());

        int direction = color.equals("white") ? 1 : -1;

        if (rowDiff == direction && colDiff == 0) return true;

        if (!hasMoved && rowDiff == 2 * direction && colDiff == 0) return true;

        if (rowDiff == direction && colDiff == 1) return true;

        return false;
    }

    @Override
    public String getName() { return "Pawn"; }
}
