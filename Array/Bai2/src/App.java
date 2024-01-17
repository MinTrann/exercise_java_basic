//* Tìm số lớn nhất trong mảng  */
import java.util.Scanner;
public class App {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
System.out.print("Nhap vao so luong phan tu co trong mang : ");
   int n = scanner.nextInt();
   //* Kiểm tra n phải là số nguyên dương */
        if (n <=  0){
            System.out.println("Vui long nhap mot so nguyen duong !");
            // return;
        }
       int[] arr = new int[n];
       //* Nhập vào các phần tử trong mảng  */
       System.out.println("Nhap vao cac phan tu trong mang");
            for (int index = 0; index < n; index++) {
                System.out.print("Nhap vao phan thu "+ (index+1)+ " : ");
                arr[index] = scanner.nextInt();
            }
            System.err.println("So lon nhat trong mang la : "+max(arr));
            System.err.println("So nho nhat trong mang la : "+min(arr));

            scanner.close();
        }
        public static  int max (int[] arr){
            int max = arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
        public static int min (int[] arr){
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
}