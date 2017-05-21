package com.uday.day5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F10 {

	public static void main(String[] args) {

		File f1 = new File("D:\\Prabhas.jpg");
		File f2=new File("D://rajkis.jpg");
		FileInputStream fis = null;
		BufferedInputStream bin = null;
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fis = new FileInputStream(f1);
			bin = new BufferedInputStream(fis);
			byte b[] = new byte[(int) f1.length()];
			fis.read(b);
			bin.read(b);
			System.out.println(bin);
			fout = new FileOutputStream(f2);
			bout = new BufferedOutputStream(fout);
			bout.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bout != null) {
				try {
					bout.flush();
					bout.close();
					bout = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fout != null) {
				try {
					fout.close();
					fout = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		}

		System.out.println("done");
	}

}
