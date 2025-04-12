package StaticJava;

public class Counter2 {

    static int count = 0; // sẽ lấy bộ nhớ MỚI 1 lần duy nhất khi khởi tạo lần đầu đến lúc kết thúc chương trình (hoàn thành 1 lần run)

    Counter2() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter2 c1 = new Counter2(); //Khởi tạo lần 1 //count = 1
        Counter2 c2 = new Counter2(); //Khởi tạo lần 2 //count = 2
        Counter2 c3 = new Counter2(); //Khởi tạo lần 3 //count = 3

    }

}
