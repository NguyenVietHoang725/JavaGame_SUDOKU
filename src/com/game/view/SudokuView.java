package com.game.view;

import com.game.interfaces.Displayable;
import com.game.model.Node;

public class SudokuView implements Displayable {

	@Override
	public void displayBoard(Node[][] board) {
		System.out.println("Sudoku Board:");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print((board[i][j].getValue() == 0 ? "." : board[i][j].getValue()) + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
	}

	@Override
	public void showMessage(String message) {
		System.out.println(message);
	}

}
