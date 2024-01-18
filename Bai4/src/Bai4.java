import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Bai4 {
    public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma so sinh vien : ");
            String maSinhVien = scanner.nextLine();
            if (kiemTra(maSinhVien)) {
                System.out.print("Ma so sinh vien hop le !");
            }else{
                System.out.println("Ma so sinh vien khong hop le !");
            }
            scanner.close();
    }
    public static boolean kiemTra(String  maSinhVien) {
        //* Sử dụng biểu thức chính quy kiểm tra định dạng  */
        String regex ="B[1-9]\\d{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(maSinhVien);

        return matcher.matches();

    }
}
