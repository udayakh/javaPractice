package com.uday.day5;

import java.io.File;

public class F3 {

	public static void main(String[] args) {

		File f1=new File("D:\\abc1");
		System.out.println(f1.exists());
		boolean b1=f1.mkdir();
		System.out.println(b1);
		System.out.println("done");
	}

}
