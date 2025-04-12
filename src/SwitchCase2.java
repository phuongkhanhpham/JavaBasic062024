public class SwitchCase2 {
    public static void main(String[] args) {
        String browser = "  Firefox ";

        //Hàm toLowerCase() dùng chuyển chuỗi (String) về chữ thường
        //Hàm toUpperCase() dùng chuyển chuỗi (String) về chữ in hoa
        //Hàm trim() dùng để cắt bỏ khoảng trắng 2 cầu của chuỗi

        //Nếu không dùng break, when meet case map condition, will run code in that case và các case bên dưới tới khi đụng break;
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Chạy test với trình duyệt Chrome.");
            case "edge":
                System.out.println("Chạy test với trình duyệt MS Edge.");
                break;
            case "firefox":
                //Khi browser = "firefox"; bỏ qua 2 case trên do không map được condition, run code trong case "firefox"
                System.out.println("Chạy test với trình duyệt là Firefox.");
                //Không đụng break nên tiếp tục chạy case dưới mà không đi check condition nữa
            default:
                System.out.println("Chạy test với trình duyệt Chrome mặc định");
                break; //Default có thể không cần dùng break;
        }
    }
}
