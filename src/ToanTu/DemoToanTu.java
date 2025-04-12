package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;
        double d, e, f;
        d = e = f = 0;

        //Toán tử số học
        System.out.println("a / b = " + a / b);
        System.out.println("a % b = " + a % b);
        System.out.println(a++); //a = a + 1
        System.out.println(a);
        System.out.println("a = " + (a += 5));

        System.out.println(a + b - c); //không nên để phép tính tràn lan
        System.out.println(a + b * c / 5); //nên chủ động dùng () để control để dễ đọc và dễ hiểu

        //Toán tử so sánh và logic
        System.out.println("So sánh a != b: " + (a != b));
        System.out.println((a > b) && (b > c));
        System.out.println((a > b) || (b > c) || (a > c) || (b < c));

        System.out.println(((a < b) && (b > c)) || ((a == b) && (a != c)));

    }


}
