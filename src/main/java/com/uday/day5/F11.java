package com.uday.day5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F11 {

	public static void main(String[] args) {

		File f1 = new File("D://prabhus.jpg");

		try (FileInputStream fis = new FileInputStream(f1);
				BufferedInputStream bin = new BufferedInputStream(fis);
				FileOutputStream fout = new FileOutputStream(f1);
				BufferedOutputStream bout = new BufferedOutputStream(fout);) {
			byte b[] = new byte[(int) f1.length()];
			fis.read(b);
			bin.read(b);
			bout.write(b);
			bout.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("done");
	}

}
