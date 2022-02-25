package com.Syntax_09;

public class HomeWork_3_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 20, 30, 40, 50 };

		int sum = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);

		System.out.println(sum);

		int[] values = new int[5];

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;

		int largest;

		int summ = (values[0] + values[1] + values[2] + values[3] + values[4]);

		System.out.println(summ);

		if (values[0] > values[1] && values[0] > values[2]) {
			largest = values[0];

		}

		else if (values[1] > values[2] && values[1] > values[3]) {
			largest = values[1];

		}
		if (values[2] > values[3] && values[2] > values[4]) {
			largest = values[2];

		}else {
			System.out.println(values[4]+" is the largest number");
		}

	}

}
