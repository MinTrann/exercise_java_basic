//*Tính giai thừa của một số nguyên n (Sử dụng đệ quy) */

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong n : ");
        int num = scanner.nextInt();
        System.out.println("Giai thua cua " + num + " la : " + calculateFactorial(num));
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Giai thua chi duoc ding nghia cho so nguyen duong !");
        }
            //   đk dừng: giai thừa của 0 hoặc 1 là 1.
        if (n == 0 || n == 1) {
            return 1;
        }
        //   đệ quy để tính giai thừa của n-1.
        return n * calculateFactorial(n - 1);
     
    }
}
