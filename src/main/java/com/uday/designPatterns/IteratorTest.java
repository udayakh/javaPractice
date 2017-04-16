package com.uday.designPatterns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class IteratorTest {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		number.forEach(System.out::print);
		System.out.println();
		System.out.println(totalValues(number, e -> true));
		System.out.println(totalValues(number, e -> e % 2 == 0));
	}

	private static int totalValues(List<Integer> number, Predicate<Integer> selector) {
		/*int result = 0;
		for (int i : number) {
			if (selector.test(i)) {
				result += i;
			}
		}
		return result;*/
		
		return number.stream().reduce(0, Integer::sum);
	}

}
