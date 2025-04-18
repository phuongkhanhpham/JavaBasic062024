package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Set
        //Không lưu dữ liệu trùng lặp
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Task");
        menu.add("Sales");
        menu.add("Project");

        System.out.println(menu.contains("Task1"));
        menu.remove("Sales");
        System.out.println(menu.size());

        System.out.println("Các phần tử của Set");
        System.out.println("\t" + menu + "\n");

        System.out.println("--------------------");
        //Duyệt giá trị trong Set
        //Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\n--------------------");
        //Show set through For-each
        for (String obj : menu) {
            System.out.println(obj);
        }

    }
}
