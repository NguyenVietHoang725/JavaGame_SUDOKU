package com.sudoku.controller;

import com.sudoku.model.Game;
import com.sudoku.model.Move;
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
			Move move = ip.getMove();
			
			if (ip.validate(move) && model.validate(move)) {
				model.updateValue(move);
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
