public class XuLyChuoi {
    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String s2 = "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        //Chuỗi bắt đầu từ 0, tính khoảng trắng là 1 ký tự

        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6, 11));

        //Ghép chuỗi
        System.out.println(s1 + " " + s2);

        //Chuyển kiểu in hoa thường
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());

        //Xóa ký tự khoảng trắng 2 đầu
        String s3 = " Test Automation ";
        System.out.println(s3.trim());

        //Độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + s2.length());

        //Tìm kiếm ký tự
        System.out.println(s1.charAt(6));

        //Tìm kiếm vị trí
        System.out.println(s1.indexOf("e"));

        //So sánh chuỗi
        //+ So sánh bằng
        String s4 = "Test Automation";
        System.out.println(s3.equals(s4));
        System.out.println(s3.trim().equals(s4));

        //+ So sánh chứa
        System.out.println(s4.contains("Automation1"));

        //So sánh bỏ qua hoa thường
        System.out.println(s4.equalsIgnoreCase("test autOmation"));

    }
}
