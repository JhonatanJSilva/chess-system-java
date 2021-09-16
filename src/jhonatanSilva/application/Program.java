package jhonatanSilva.application;

import jhonatanSilva.boardgame.Board;
import jhonatanSilva.boardgame.Position;

public class Program {

    public static void main(String[] args) {

        Board board = new Board(3, 5);

        System.out.println(board.getColumns());
        System.out.println(board.getRows());
    }

}
