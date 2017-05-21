package com.uday.day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F8 {

	public static void main(String[] args) throws IOException {

		FileWriter out = null;
		BufferedWriter bw = null;
		try {
			out = new FileWriter("D://test123.txt");
			bw = new BufferedWriter(out);
			bw.write("Hello to all");
			bw.newLine();
			bw.write("Hello to all");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				bw.flush();
				bw.close();
			}
			if (out != null) {
				out.close();
			}
		}

		System.out.println("Done");
	}

}
