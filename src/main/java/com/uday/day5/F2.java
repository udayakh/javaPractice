package com.uday.day5;

import java.io.File;
import java.io.IOException;

public class F2 {

	public static void main(String[] args) {

		File f2 = new File("D:\\test2.txt");
		try {
			System.out.println(f2.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("done");

	}

}
