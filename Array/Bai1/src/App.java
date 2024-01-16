//* Nhập vào n (n là số phần tử trong mảng ) sau đó nhập vào các phần tử trong mảng . Output -> Giá trị trung bình. */
import java.util.Scanner;

public class App {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
             //* Nhập vào số phần tử của mảng  */
                System.out.print("Nhap vao so luong phan tu trong mang : ");
                int n = scanner.nextInt();
            //* Khởi tạo mảng có kích thước n */
                int[] arr = new int[n];
            //* Nhập vào từng phần tử trong mảng  */
                System.out.print("Nhap vao cac phan tu trong mang :");
            for(int i = 0; i < n; i++){
                System.out.print("Phan tu thu " +(i +1)+": ");
                arr[i] = scanner.nextInt();
            }
                System.out.println("Trung binh cong cua mang la : "+TBC(arr));
             scanner.close();
    }
  public static double TBC(int[] arr){
    int sum  = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return (double)sum / arr.length;
  }
}
