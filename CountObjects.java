package com.veritis.j2se.DemoProject;

public class CountObjects {
	
	static int count=0;
	CountObjects()
	{
	
		count = count + 1;
		
	}
	
	public static void main(String[] args) {
		
		
		
		CountObjects c1= new CountObjects();
		CountObjects c2= new CountObjects();
		CountObjects c3= new CountObjects();
		CountObjects c4= new CountObjects();
		CountObjects c5= new CountObjects();
		System.out.println(" Number of objects created:" +count);

	}
}


