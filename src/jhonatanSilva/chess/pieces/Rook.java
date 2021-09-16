package jhonatanSilva.chess.pieces;

import jhonatanSilva.boardgame.Board;
import jhonatanSilva.chess.ChessPiece;
import jhonatanSilva.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
