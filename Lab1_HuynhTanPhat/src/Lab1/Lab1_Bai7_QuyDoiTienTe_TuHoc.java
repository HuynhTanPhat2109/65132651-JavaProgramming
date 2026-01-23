package Lab1;

import java.util.Scanner;

public class Lab1_Bai7_QuyDoiTienTe_TuHoc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double tyGiaUSD = 26.244;
		final double tyGiaEUR = 30.805;
		
		System.out.print("Nhập số tiền USD: ");
		double usd = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Nhập số tiền EUR: ");
		double eur = Double.parseDouble(scanner.nextLine());
		
		double usdSangVN = usd * tyGiaUSD;
		double eurSangVN = eur * tyGiaEUR;
		
		System.out.printf("\n%.2f USD = %.2f VNĐ",usd,usdSangVN);
		System.out.printf("\n%.2f EUR = %.2f VNĐ",eur,eurSangVN);
		
		scanner.close();
	}
}
