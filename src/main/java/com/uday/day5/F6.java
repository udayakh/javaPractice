package com.uday.day5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F6 {

	public static void main(String[] args) {

		File f1 = new File("D:/test123.txt");

		FileWriter out = null;
		try {
			out = new FileWriter(f1);
			out.write("uday");
			out.write("\t");
			out.write("kumar");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("done");
	}

}
