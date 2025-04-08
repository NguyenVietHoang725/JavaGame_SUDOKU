package com.sudoku.model;

public class Move {
	
	// Attributes
	private int row, col;
	private int prevVal;
	private int newVal;
	
	public Move(int row, int col, int prevVal, int newVal) {
		super();
		this.row = row;
		this.col = col;
		this.prevVal = prevVal;
		this.newVal = newVal;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getPrevVal() {
		return prevVal;
	}

	public void setPrevVal(int prevVal) {
		this.prevVal = prevVal;
	}

	public int getNewVal() {
		return newVal;
	}

	public void setNewVal(int newVal) {
		this.newVal = newVal;
	}
	
	
}
