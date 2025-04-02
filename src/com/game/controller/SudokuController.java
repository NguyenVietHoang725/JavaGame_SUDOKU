package com.game.controller;

import com.game.interfaces.Playable;
import com.game.model.Game;
import com.game.utils.InputUtils;
import com.game.view.SudokuView;

public class SudokuController implements Playable {
	private Game model;
	private SudokuView view;
	private InputUtils ip;
	
	public SudokuController(Game model, SudokuView view, InputUtils ip) {
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
