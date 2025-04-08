package com.sudoku.utils;

import java.util.Scanner;

public class InputHandler {

	private Scanner scn;

	public InputHandler() {
		scn = new Scanner(System.in);
	}

	public int[] getInput() {
		int row = scn.nextInt();
		int col = scn.nextInt();
		int value = scn.nextInt();

		return new int[] { row - 1, col - 1, value };
	}

	public boolean validate(int row, int col, int value) {
		if (row < 0 || row > 8 || col < 0 || col > 8 || value < 1 || value > 9) {
			return false;
		}
		return true;
	}

}
