package com.uday.day3;

import java.io.IOException;

class one {
	public void main1() throws Exception{
		System.out.println("main1 method from one class");
	}
}

class two extends one {
	public void main1() throws IOException{
		System.out.println("main1 method from two class");
	}
}

public class U1 {

	public static void main(String[] args) {

	}

}
