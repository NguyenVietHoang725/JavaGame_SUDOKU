package com.sudoku.main;

import com.sudoku.model.Game;
import com.sudoku.controller.SudokuController;
import com.sudoku.utils.InputHandler;
import com.sudoku.view.SudokuView;

public class Main {
	public static void main(String[] args) {
		int[][] initialBoard = { { 5, 3, 0, 0, 0, 0, 0, 9, 0 }, { 6, 0, 0, 1, 0, 9, 0, 0, 0 },
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		Game model = new Game(initialBoard);
		SudokuView view = new SudokuView();
		InputHandler ip = new InputHandler(model);
		SudokuController controller = new SudokuController(model, view, ip);

		controller.launch();
	}
}
