package Lab1;

import java.util.Scanner;

public class Lab1_Bai5_TinhBMI_TuHoc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào chiều cao (m): ");
		double chieuCao = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Nhập vào cân nặng (kg): ");
		double canNang = Double.parseDouble(scanner.nextLine());
		
		double bmi = canNang / (chieuCao * chieuCao);
		
		System.out.printf("\nChiều cao: %.2f || Cân nặng: %.2f || Chỉ số BMI: %.2f\n",chieuCao, canNang, bmi);
		
		if (bmi < 18.5) {
			System.out.println("Phân loại: Thiếu cân");
		} else if (bmi < 25) {
			System.out.println("Phân loại: Bình thường");
		} else if (bmi < 30){
			System.out.println("Phân loại: Thừa cân");
		} else {
			System.out.println("Phân loại: Béo phì");
		}
		
		scanner.close();
	}

}
