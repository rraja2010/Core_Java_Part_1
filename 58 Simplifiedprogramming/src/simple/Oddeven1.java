package simple;

import java.util.Scanner;

class Oddeven1 {
	public static void main(String[] args) {
		System.out.println("Enter range of odd even number you want!! ");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter teh lower Range!!");
		int loweRange = in.nextInt();
		System.out.println("Enter the upper Range!!");
		int upperRange = in.nextInt();
		System.out.println("Enter your choice Odd/Even type Odd/Even!");
		String choice = in.next();

		for (int i = loweRange; i <= upperRange; i++) {
			if ("Even".equalsIgnoreCase(choice)) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			} else {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
