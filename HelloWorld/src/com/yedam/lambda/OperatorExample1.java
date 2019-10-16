package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample1 {
	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = 0;
		IntBinaryOperator oper = new IntBinaryOperator() {
			int result = 10;

			@Override
			public int applyAsInt(int a, int b) {
				result = 20;
				return 0;
			}
		};
		result = minOrMax(oper);
		System.out.println("max: " + result);

//		results = minOrMax((a, b) -> {
//			return (a >= b ? b : a);
//		});
		System.out.println("min: " + minOrMax((a, b) -> {
			return (a >= b ? b : a);
		}));
	}
}