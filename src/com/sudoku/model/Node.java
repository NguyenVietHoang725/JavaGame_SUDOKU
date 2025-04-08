package com.sudoku.model;

public class Node {
	
	// Attributes
	private int x, y;
	private int value;
	
	// Default Constructor
	public Node(int x, int y, int value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	// Getters and Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
}
