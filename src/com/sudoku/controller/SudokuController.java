package com.sudoku.controller;

import com.sudoku.model.Game;
import com.sudoku.interfaces.Playable;
import com.sudoku.utils.InputHandler;
import com.sudoku.view.SudokuView;

public class SudokuController implements Playable {
	private Game model;
	private SudokuView view;
	private InputHandler ip;
	
	public SudokuController(Game model, SudokuView view, InputHandler ip) {
        this.model = model;
        this.view = view;
        this.ip = ip;
    }
	
	@Override
	public void launch() {
		while (!model.isSolved()) {
			view.displayBoard(model.getBoard());
			view.showMessage("Enter ur move (x, y, val) : ");
			int[] move = ip.getInput();
			
			int row = move[0];
			int col = move[1];
			int value = move[2];
			
			if (ip.validate(row, col, value) && model.validate(row, col, value)) {
				model.updateValue(row, col, value);
			} else {
				view.showMessage("Invalid move. Enter again!");
			}
		} 
		
		view.displayBoard(model.getBoard());
        view.showMessage("Ping pong, YOU WIN!!!");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
