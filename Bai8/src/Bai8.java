import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen n : ");
        int n = scanner.nextInt();
          ketQua(n);
        scanner.close();

    }
    public static void ketQua(int n){
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
    }
}
