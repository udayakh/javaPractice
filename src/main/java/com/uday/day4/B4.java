package com.uday.day4;
public class B4{
	private int priv;
	public int pub;
	protected int prot;
	int def;
	
	public static void main(){
		B4 b=new B4();
		System.out.println(b.prot);
	}
}