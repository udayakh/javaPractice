package com.uday.day5;

import java.io.File;

public class F4 {

	public static void main(String[] args) {

		File f1=new File("D:/abc/xyz");
		System.out.println(f1.mkdir());
		System.out.println("done");
		
		String s[]={"raj","kishor","uday"};
		String s1=s[0]+"/"+s[1]+"/"+s[2];
		File f2=new File("D://"+s1);
		f2.mkdirs();
	}

}
