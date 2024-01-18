import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao mot so nguyen: ");
            int soNguyen = scanner.nextInt();

            if (soNguyen > 0) {
                System.out.print("So vua nhap la so nguyen duong!");
            }else{
                System.out.print("So vua nhap la so nguyen am !");
            }
            scanner.close();
    }
}
