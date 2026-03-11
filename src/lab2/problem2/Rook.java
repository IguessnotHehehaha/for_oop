package lab2.problem2;
public class Rook extends Piece {
    public Rook(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (!target.isValid()) return false;
        return position.getRow() == target.getRow() || position.getCol() == target.getCol();
    }

    @Override
    public String getName() { return "Rook"; }
}
