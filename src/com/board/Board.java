package com.board;

public class Board {

    public String[][] board;

    public Board(String[][] board){
        this.board = board;
    }

    public void drawBoard(int y, int x) {
        for (int i = 0; i < board.length; i++) {
            String line = "";
            for (int j = 0; j < board[i].length; j++) {
                if (i == x && j == y){
                    board[i][j] = "x";

                }
                else {
                    board[i][j] = "[]";

                }
                if (j == 0) {
                    line = board[i][j];
                } else {
                    line += board[i][j];
                }
            }
            System.out.println(line);
            line = null;
        }
    }
}
