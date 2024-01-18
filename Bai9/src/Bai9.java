//* Viết chương trình cho phép nhập vào một số nguyên n (n <= 20 ), in ra số Fibonacci ứng với nó  */
//* Số Fibonacci là số mà nó bằng tổng của hai số Fibonaccin trước nó. */

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao mot so nguyen n (n <=20): ");
            int n = scanner.nextInt();
            if (n <= 20) {
                System.out.println("So Fibonacci thu "+ n +" la: "+ Fibonacci(n));
            }else{
                System.out.println("Nhap so nho hon 20");
        }                     

            scanner.close();
    }
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else{
            int fibNMinus1 = 1;
            int fibNMinus2 = 1;
            int fibN = 0;

            for (int i = 2; i <= n ; i++) {
                fibN = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fibN;
            }
            return fibN;
        }
    }
}
