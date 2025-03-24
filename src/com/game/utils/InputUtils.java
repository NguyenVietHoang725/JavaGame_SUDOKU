package com.game.utils;

import java.util.Scanner;

import com.game.interfaces.Inputable;

public class InputUtils implements Inputable {
	private Scanner scn;
	
	public InputUtils() {
		scn = new Scanner(System.in);
	}

	@Override
	public int[] getInput() {
		int row = scn.nextInt();
		int col = scn.nextInt();
		int value = scn.nextInt();
		
		return new int[] {row, col, value};
	}

}
