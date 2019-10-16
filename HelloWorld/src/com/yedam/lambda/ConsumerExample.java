package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "8");

		};
		consumer.accept("Java");

		BiConsumer<String, String> biconsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biconsumer.accept("Java", "8");

		DoubleConsumer doubleConsumer = (d) -> {
			System.out.println("Java" + d);
		};
		doubleConsumer.accept(8.0);

		ObjIntConsumer<String> objConsumer = (s, i) -> {
			System.out.println(s + i);
		};
		objConsumer.accept("Java", 8);
	}
}
