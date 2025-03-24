package com.game.interfaces;

import com.game.model.Node;

public interface Updatable {
	void updateValue(int row, int col, int value);
	
	boolean isSolved();
	
	Node[][] getBoard();
}
