package com.Syntax_Class07;

public class WhileLoopIntro {

	public static void main(String[] args) {

		int time = 10;

		if (time < 12) {
			System.out.println("Morning");

			/*
			 * change if to while
			/******************************************************************************/

			while (time < 12) {
				System.out.println("Morning"); // morning prints 2 times.
				time++;

		}

		while (time > 12) {
			System.out.println("Morning"); // morning prints 2 times.
				time++;
		}
	}

}

}
