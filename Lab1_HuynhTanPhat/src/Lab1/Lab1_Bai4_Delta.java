package Lab1;

import java.util.Scanner;

public class Lab1_Bai4_Delta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào hệ số a: ");
		double a = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Nhập vào hệ số b: ");
		double b = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Nhập vào hệ số c: ");
		double c= Double.parseDouble(scanner.nextLine());
		
		double delta = b * b - 4 * a * c;

		System.out.printf("\nDelta = %.2f\n",delta);
		
		if(delta >= 0) {
			Double canDelta = Math.sqrt(delta);
			System.out.printf("\nCăn Delta = %.2f",canDelta);
		}
		else {
			System.out.println("Delta nhỏ hơn 0 nên không có căn bậc 2");
		}
		
		scanner.close();
	}

}
