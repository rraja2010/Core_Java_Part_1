package simple;

import java.util.Scanner;

public class Binery2Decimal {
	public static void main(String[] args) {

		int bin = 0;// binary value
		int decimal = 0;// decimal value
		Scanner in = new Scanner(System.in); // Scanner object
		int p = 1; // the power of 2
		System.out.println("Enter Binary Number"); // getting binary number
		bin = in.nextInt();
		// the loop - checking and converting
		while (bin > 0) {
			int remenderDig = bin % 10;
			if (remenderDig != 0 && remenderDig != 1) {
				System.out.println("Number is not Binary");
				System.exit(0);
			}
			// converting
			else {
				decimal = decimal + remenderDig * p;
				p = p * 2;
				bin = bin / 10;
			}
		}
		// printing decimal value
		System.out.println("Decimal Value is: " + decimal);

	}
}

/*

binary number: 	1 		1 		1 		0 		0 		1
power of 2: 	2^5 	2^4 	2^3 	2^2 	2^1 	2^0

111001 = 		1⋅2^5+	1⋅2^4+	1⋅2^3+	0⋅2^2+	0⋅2^1+	1⋅2^0 = 57


(111001)₂ = 	(1 × 2⁵) + (1 × 2⁴) + (1 × 2³) + (0 × 2²) + (0 × 2¹) + (1 × 2⁰) = (57)
*/
