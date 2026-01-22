package Lab1;
import java.util.Scanner;
public class Lab1_Bai1_DTB {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Nhập vào Họ và Tên sinh viên: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Nhập vào điểm trung bình: ");
		Double diemTB = Double.parseDouble(scanner.nextLine());
		
		System.out.print("\n===Thông tin sinh viên ===\n");
		System.out.printf("\nHọ và tên: %s", hoTen);
		System.out.printf("\nĐiểm trung bình: %.2f", diemTB);
		
		scanner.close();
	}
}
