package Lab1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab1_Bai8_GhiVaDocNhatKy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập vào nhật ký: ");
		String noiDung = scanner.nextLine();
		
		try {
			FileWriter fw = new FileWriter("nhatky.txt",true);
			fw.write(noiDung);
			fw.close();
			System.out.println("Đã ghi file thành công!");
		} catch (Exception e) {
			System.out.println("Lỗi ghi file" + e.getMessage());
		}
		
		try {
			Scanner fileScanner = new Scanner(new File("nhatky.txt"));
			while(fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Lỗi ghi file" + e.getMessage());
		}
	}

}
