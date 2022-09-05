package com.lara;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		System.out.println("begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		System.out.println("you have enterd:" + s1);

	}
}

/*
inside the Scanner class there is a method name next()
whenever it is executing the program execution halt because
next() required some input from the keyboard.
*/