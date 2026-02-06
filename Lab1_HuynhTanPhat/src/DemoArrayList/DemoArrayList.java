package DemoArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
        // dùng interface List 
        List<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Sữa");
        shoppingList.add("Trứng");
        
        System.out.println("Cần mua: " + shoppingList);

        // Giả sử: Sau này phát hiện cần chèn/xóa nhiều, nên đổi sang LinkedList.
        // chỉ cần thay đổi phần sau dấu "="
        shoppingList = new LinkedList<>(shoppingList); 
        // Code bên dưới vẫn chạy bình thường vì biến 'shoppingList' vẫn là kiểu List
        System.out.println("Dùng LinkedList: " + shoppingList);

        // Khai báo bằng Class (ArrayList)

        
        ArrayList<String> hardList = new ArrayList<>();
        hardList.add("Laptop");
        
        // Dòng dưới này sẽ LỖI ngay nếu uncomment
        // hardList = new LinkedList<>(); // Lỗi biên dịch: LinkedList không phải là ArrayList
        
        System.out.println("Dùng biến cụ thể: " + hardList);
		
		
	}

}
// List	Là một Interface. Nó định nghĩa các hành động (như add, get, remove) nhưng không chứa mã xử lý chi tiết và dễ sửa lại và phát triển sau này.
// Arraylist Là một Class. Nó thực thi interface List và chứa mã xử lý cụ thể, sử dụng ArrayList nếu muốn dùng method của nó
