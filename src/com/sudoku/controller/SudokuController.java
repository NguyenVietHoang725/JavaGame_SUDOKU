package com.sudoku.controller;

import com.sudoku.model.Game;
import com.sudoku.model.Move;

import java.util.Set;

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
			
			view.showSelectAction();
			
			int choice = ip.getAction();
			
			switch (choice) {
				case 1:
					view.showMessage("Enter your move (x, y, val): ");
					Move move = ip.getMove();
					if (ip.validate(move) && model.validate(move)) {
						model.updateValue(move);
					} else {
						view.showMessage("Invalid move. Try again!");
					}
					break;
				case 2:
					model.undo();
					break;
				case 3:
					model.redo();
					break;
				case 4: 
					view.showMessage("Enter node (x, y) to get hint: ");
					int getHint[] = ip.getHintInput();
					Set<Integer> hint =  model.hint(getHint[0], getHint[1]);
					view.showMessage("Hint: " + hint);
					break;
				default:
					view.showMessage("Invalid action. Try again!");
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
