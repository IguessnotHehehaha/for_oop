package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (!target.isValid()) return false;
        int rowDiff = Math.abs(target.getRow() - position.getRow());
        int colDiff = Math.abs(target.getCol() - position.getCol());
        return rowDiff == colDiff && rowDiff > 0;
    }

    @Override
    public String getName() { return "Bishop"; }
}
