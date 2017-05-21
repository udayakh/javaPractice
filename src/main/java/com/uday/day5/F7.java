package com.uday.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F7 {

	public static void main(String[] args)  {

		File f1=new File("D:/test123.txt");
		FileReader in = null;
		try {
			in = new FileReader(f1);
			long size=f1.length();
			char[] x=new char[(int) size];
			in.read(x);
			String s1=new String(x);
			System.out.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null){
				in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
