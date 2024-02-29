import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhap so phan tu cua day so : ");
        int n = scanner.nextInt();

       
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thuc thu " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

       
        System.out.println("Day so voi moi so cach nhau mot  tab:");
        for (double num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();

        
        int countPerfectNumbers = 0;
        System.out.println("So nguyen la so hoan thien va vi tri cua so chinh phuong:");

        for (int i = 0; i < n; i++) {
            if (isInteger(arr[i])) {
                if (isPerfectNumber((int) arr[i])) {
                    countPerfectNumbers++;
                    System.out.println("So hoan thien tai vi tri " + i + ": " + (int) arr[i]);
                }
            }
            if (isSquareNumber((int) arr[i])) {
                System.out.println("So chinh phuong tai vi tri " + i + ": " + (int) arr[i]);
            }
        }

        System.out.println("Tong so nguyen la so hoan thien: " + countPerfectNumbers);
        scanner.close();
    }

  
    public static boolean isInteger(double num) {
        return num == (int) num;
    }

    
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

     
    public static boolean isSquareNumber(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
