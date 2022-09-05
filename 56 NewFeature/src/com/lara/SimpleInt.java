package com.lara;

public class SimpleInt {
	public static void main(String[] args) {
		float si = calculateSimpleIntrest(1.0f, 10.0f, 1000.0f);
		System.out.println("Simple Intrest::"+si);
	}
	
	
	public static float calculateSimpleIntrest(float time, float intrest,float capital) {
		return  (capital * time * intrest)/100;
	}
}
