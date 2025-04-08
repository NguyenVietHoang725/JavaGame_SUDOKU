package com.sudoku.utils;

import java.util.Scanner;

import com.sudoku.model.Move;
import com.sudoku.model.Game;

public class InputHandler {

	private Scanner scn;
	private Game game;

	public InputHandler(Game game) {
		this.game = game;
		scn = new Scanner(System.in);
	}

	public Move getMove() {
		int row = scn.nextInt();
		int col = scn.nextInt();
		int newVal = scn.nextInt();
		int prevVal = game.getNode(row - 1, col - 1).getValue();
		
		return new Move(row - 1, col - 1, prevVal, newVal);
	}

	public boolean validate(Move move) {
		if (move.getRow() < 0 || move.getRow() > 8 || move.getCol() < 0 || move.getCol() > 8 || move.getNewVal() < 1 || move.getNewVal() > 9) {
			return false;
		}
		return true;
	}

}
