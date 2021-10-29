package com.kitisherbackaya.OOP.September20;

public class Chess {
    char[][] board = new char[8][8];
    public Chess(){
        for ( int row = 0; row< board.length; row++){
            for (int column = 0; column < board[row].length;column++){
                board[row][column] = '.';
            }
        }
    }
    public void showBoard(){
        for (int row = 0; row< board.length;row++){
            for (int column = 0; column < board[row].length;column++){
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }
    public void addFigure(char figure, int row, int column){
        board[row][column] = figure;
    }


}
