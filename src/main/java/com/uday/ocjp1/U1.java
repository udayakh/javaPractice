package com.uday.ocjp1;

public class U1 {

	static int i=10;
	public final static void main(String... args) {
		int array[]=new int[2];
		array[1]=10;
		for(int i:array){
			System.out.println(i);
		}
		
		int a[]={3,2,1,0};
		int y=a.length;
		int x=y-1;
		while(y>=0){
			System.out.println(a[--y]);
		}
		
		
		
	}
	
}
