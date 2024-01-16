import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh  b :");
        double b = scanner.nextDouble();
        System.out.print("Nhap canh c :");
        double c = scanner.nextDouble();
    if (kiemTra(a, b, c)) {
        System.out.println("Ba canh vua nhap la mot tam giac !");   
    }else{
        System.out.println("Ba canh vua nhap khong phai  mot tam giac !");
    }
      scanner.close();
    }
    public static boolean kiemTra (double a, double b,double c) {
                return (a + b  >0)&& (a + c > b) &&(b + c > a);
    }
}
