import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen n: ");
        int n = scanner.nextInt();
        System.out.println("Tong cac so chan tu 0 den " + n + " la: " + tinhTongSoChan(n));
        scanner.close();
    }

    public static int tinhTongSoChan(int n) {
        int tong = 0;

        for (int i = 0; i <= n; i += 2) {
            tong += i;
        }

        return tong;
    }
}
