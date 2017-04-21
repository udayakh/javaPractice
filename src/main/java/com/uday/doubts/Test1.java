package com.uday.doubts;

public class Test1 {
		static int x=1;
	public static void main(String args[]){
		int _6=6;
		if(_6>6){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		int[] nums={0,1,2,3,4};
		for (int x:nums){
			System.out.println(x);
			continue;
		}
		System.out.println("-----");
		System.out.println(" "+1+2);
		System.out.println(" "+(1+2));
		System.out.println("-------");
		Character c=new Character('a');
		System.out.println(c.isLetterOrDigit(c));
		System.out.println("-----");
		Comparable c1="uday";
		Comparable c2=new String("uday");
		System.out.println(c1.equals(c2));
	}

}
