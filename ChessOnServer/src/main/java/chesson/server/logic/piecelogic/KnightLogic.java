package chesson.server.logic.piecelogic;

import chesson.server.models.Square;

import java.util.ArrayList;

public class KnightLogic implements PieceLogic {
    @Override
    public Square MovePiece(Square from, Square to) {
        if(CanMovePiece(from, to)) {
            return to;
        } else {
            return from;
        }
    }

    @Override
    public boolean CanMovePiece(Square from, Square to) {
        return MovesCorrectly(from, to) && !MovesOutOfBounds(to);
    }

    @Override
    public ArrayList<Square> getSquaresInBetweenMove(Square from, Square to) {
        return new ArrayList<>();
    }

    private boolean MovesCorrectly(Square from, Square to) {
        if(CorrectHorizontalJump(from, to) || CorrectVerticalJump(from, to)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean CorrectHorizontalJump(Square from, Square to) {
        if(from.getRank() - to.getRank() == 1 || to.getRank() - from.getRank() == 1) {
            return from.getFile() - to.getFile() == 2 || to.getFile() - from.getFile() == 2;
        } else {
            return false;
        }
    }

    private boolean CorrectVerticalJump(Square from, Square to) {
        if(from.getFile() - to.getFile() == 1 || to.getFile() - from.getFile() == 1) {
            return from.getRank() - to.getRank() == 2 || to.getRank() - from.getRank() == 2;
        } else {
            return false;
        }
    }

    private boolean MovesOutOfBounds(Square to) {
        return to.getFile() > 8 || to.getRank() > 8;
    }
}
