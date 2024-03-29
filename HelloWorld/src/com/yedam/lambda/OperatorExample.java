package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;

	}

	public static void main(String[] args) {
		/*
		 * IntBinaryOperator oper = new IntBinaryOperator() { int result = 0;
		 * 
		 * @Override public int applyAsInt(int a, int b) { result = (a >= b ? a : b);
		 * return result; } };
		 */
		
		/*IntBinaryOperator oper = (a, b) -> {
			int result = 0;
			result = (a >= b ? a : b);
			return result;
		};*/  //
		
		int result=0;
		IntBinaryOperator oper = (int a, int b)->{
			return (a >= b ? a : b);
		};

		//int result = minOrMax(oper); //
		result = minOrMax(oper);
		
		System.out.println("max: " + result);

		result = minOrMax((a, b) -> {

			return a >= b ? b : a;
		});
		System.out.println("min: " + result);
	}

}
