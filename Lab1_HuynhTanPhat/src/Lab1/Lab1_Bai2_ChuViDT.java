package Lab1;
import java.util.Scanner;
public class Lab1_Bai2_ChuViDT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài hình chữ nhật: ");
		int chieuDai = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhập chiều rộng hình chữ nhật: ");
		int chieuRong = Integer.parseInt(scanner.nextLine());
		
		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = chieuDai * chieuRong;
		int canhNho = Math.min(chieuDai,chieuRong);
		
		System.out.printf("\nChu vi hcn là: %d || Diện tích hcn là: %d || cạnh nhỏ nhất là: %d",chuVi,dienTich, canhNho);
		
		scanner.close();
	}
}
