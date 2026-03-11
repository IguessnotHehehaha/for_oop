package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position position, String color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position target) {
        if (!target.isValid()) return false;
        int rowDiff = Math.abs(target.getRow() - position.getRow());
        int colDiff = Math.abs(target.getCol() - position.getCol());
        boolean straightMove = position.getRow() == target.getRow() || position.getCol() == target.getCol();
        boolean diagonalMove = rowDiff == colDiff && rowDiff > 0;
        return straightMove || diagonalMove;
    }

    @Override
    public String getName() { return "Queen"; }
}
