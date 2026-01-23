package Lab1;

import java.util.Scanner;

public class Lab1_Bai6_TinhLuong_TuHoc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số giờ làm (h): ");
		double soGioLam = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Nhập tiền lương theo giờ ($): ");
		double luongTheoGio = Double.parseDouble(scanner.nextLine());
		 
		double tongLuong;
		
		if(soGioLam <= 40) {
			tongLuong = soGioLam * luongTheoGio;
		}
		else {
			tongLuong = 40 * luongTheoGio + (soGioLam - 40) * luongTheoGio * 1.5;
		}
		
		System.out.printf("\nTổng tiền lương của nhân viên là: %.2f",tongLuong);
		
		scanner.close();
	}

}
