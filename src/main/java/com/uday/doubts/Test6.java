package com.uday.doubts;

public class Test6 {

	public static void main(String[] args) {

		int count = 0;
		ROW_LOOP: for (int row = 1; row <= 3; row++)
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0)
					continue ROW_LOOP;
				count++;
			}
		System.out.println(count);

		int m = 9, n = 1, x = 0;
		while (m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		System.out.println(x);
	}

}
