package com.sudoku.model;

public class Game {
	// Attributes
	private Node[][] board;
	private static final int SIZE = 9;

	// Constructor
	public Game(int[][] initialBoard) {
		board = new Node[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = new Node(i, j, initialBoard[i][j]);
			}
		}
	}

	public void updateValue(int row, int col, int value) {
		if (validate(row, col, value)) {
			board[row][col].setValue(value);
			;
		}
	}

	public boolean validate(int row, int col, int value) {
		// Check if this node was filled
		if (board[row][col].getValue() != 0)
			return false;

		// Check if this column or this row was filled this value
		for (int i = 0; i < SIZE; i++) {
			if (board[row][i].getValue() == value || board[i][col].getValue() == value) {
				return false;
			}
		}

		// Check if this zone 3x3 was filled this value
		int startRow = (row / 3) * 3;
		int startCol = (col / 3) * 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[startRow + i][startCol + i].getValue() == value) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isSolved() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j].getValue() == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public Node[][] getBoard() {
		return board;
	}

}
