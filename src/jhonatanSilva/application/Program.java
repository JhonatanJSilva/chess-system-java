package jhonatanSilva.application;

import jhonatanSilva.boardgame.Board;
import jhonatanSilva.boardgame.Position;
import jhonatanSilva.chess.ChessMatch;

public class Program {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
