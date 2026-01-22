package Lab1;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		int canh = Integer.parseInt(scanner.nextLine());
		
		int theTich = canh * canh * canh;
		
		System.out.printf("Thể tích khối lập phương là: %d", theTich);
		
		scanner.close();
	}
}
