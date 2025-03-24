package com.game.main;

import com.game.controller.SudokuController;
import com.game.model.Game;
import com.game.utils.InputUtils;
import com.game.view.SudokuView;

public class Main {
	public static void main(String[] args) {
		int[][] initialBoard = { { 5, 3, 0, 0, 0, 0, 0, 9, 0 }, { 6, 0, 0, 1, 0, 9, 0, 0, 0 },
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		Game model = new Game(initialBoard);
		SudokuView view = new SudokuView();
		InputUtils ip = new InputUtils();
		SudokuController controller = new SudokuController(model, view, ip);

		controller.launch();
	}
}
