package com.uday.day4;

public class D7 {

	public static void main(String[] args) {

		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
			try{
			int j = 20 / 0;
			}catch(Exception e1){
				System.out.println(e1);
			}
			System.out.println(5);
		}
		System.out.println(6);
	}

}
