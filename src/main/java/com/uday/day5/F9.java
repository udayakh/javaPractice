package com.uday.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F9 {

	public static void main(String[] args) {

		FileReader in = null;
		BufferedReader br = null;
		try {
			in = new FileReader("D://test123.txt");
			br = new BufferedReader(in);
			String s1 = br.readLine();
			while (s1 != null) {
				System.out.println(s1);
				s1 = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null && in != null) {
				try {
					br.close();
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

		System.out.println("Done");
	}

}
