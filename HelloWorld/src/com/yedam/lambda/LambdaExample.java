package com.yedam.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;

	}

	public static void main(String[] args) {
		int max = maxOrMin((result, score) -> result >= score ? result : score);
		System.out.println("최대값: " + max);

		int min = maxOrMin((result, score) -> result >= score ? score : result);
		System.out.println("최소값: " + min);

	}
	
	
	

}
