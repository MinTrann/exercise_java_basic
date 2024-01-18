import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao mot so nguyen n : ");
            int n = scanner.nextInt();
            ketQua(n);
            scanner.close();
    
    }
    public static void ketQua(int n){
    System.out.print("Ket qua phep nhan cua "+ n + " voi cac so tu mot den 20 la : ");
      for (int i = 0; i <= 20; i++) {
        int ketQua = n * i;
        System.out.println(n + " * "+ i + " = " + ketQua); 
      }
    }
}
