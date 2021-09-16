package jhonatanSilva.chess.pieces;

import jhonatanSilva.boardgame.Board;
import jhonatanSilva.chess.ChessPiece;
import jhonatanSilva.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
