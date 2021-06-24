package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                    rsl = true;
                    break;
            }
        }
        return rsl;
    }

        public static boolean monoHorizontal(int[][] bord, int row) {
            boolean rsl = true;
            for (int i = 0; i < bord.length; i++) {
                if (bord[row][i] != 1) {
                    rsl = false;
                    break;
                }
            }
            return rsl;
        }

        public static boolean monoVertical(int[][] board, int column) {
            boolean rsl = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 1) {
                    rsl = false;
                    break;
                }
            }
            return rsl;
        }
    }
