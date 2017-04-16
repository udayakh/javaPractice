package com.uday.doubts;

class Singleton{
	private static Singleton instance=null;
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		Singleton s4=Singleton.getInstance();
		Singleton s5=Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}

}
