package DemoCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoCollectionArrayList {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu ArrayList
        //Được phép lưu nhiều giá trị trùng lặp
        List<String> menu = new ArrayList<>();

//        ArrayList<String> menu2 = new ArrayList<>();

        //Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Task");
        menu.add("Sales");
        menu.add("Customer");
        menu.add("Project");

        //Xóa dữ liệu
        menu.remove(3);
//        menu.remove("Task");

        //Cập nhật dữ liệu
        menu.add(3, "Tasks 123");
        menu.set(4, "Report");

        //Get giá trị theo chỉ mục
        //Vị trí bắt đầu là 0
        System.out.println(menu.get(4));

        //Kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard"));

        System.out.println("------------------------");
        //Duyệt dữ liệu kiểu ArrayList
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

        System.out.println("------------------------");
        for (String value : menu) {
            System.out.println(value);
        }

        System.out.println("\nIn kết quả menu2");
        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu); //Thêm nguyên bộ data trong menu vào menu2

        for (String value2 : menu2) {
            System.out.println(value2);
        }

    }
}
