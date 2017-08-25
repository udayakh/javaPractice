package com.uday.ocjp1;

public class U8 {

	public static void main(String[] args) {

		String name = "uday";
		String result = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			result = result + name.charAt(i);
		}
		System.out.println(result);
	
	
		int number=123;
		int result1 = 0;
		int rev=0;
		while(number >0){
			rev=number%10;//3 2 1
			result1=result1*10+rev;//3 32 321
			number=number/10;//12 1 0
		}
		System.out.println(result1);	
		System.out.println(number);
		
	}
	
	

}
