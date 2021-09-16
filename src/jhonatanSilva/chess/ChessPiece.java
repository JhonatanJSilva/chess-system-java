package jhonatanSilva.chess;

import jhonatanSilva.boardgame.Board;
import jhonatanSilva.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;
    //private Integer moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
