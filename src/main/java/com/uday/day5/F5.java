package com.uday.day5;

import java.io.File;

public class F5 {

	public static void main(String[] args) {

		File f1=new File("D:/abc");
		File f2=new File("D:/abc/hello.txt");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		if(f2.isDirectory()){
			System.out.println(f2.isFile());
		}
	}

}
