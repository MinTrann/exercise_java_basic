import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Nhap vao mot so bat ki :");
           int number = scanner.nextInt();
           String chuoiChu = numberToString(number);
           System.out.println("So " + number + " duoc viet bang chu la : "+ chuoiChu); 
            scanner.close();
    }
    public static String numberToString(int so){
            String[] donVi = {"","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
            String[] hangChuc = {"","muoi","hai muoi","ba muoi","bon muoi","nam muoi","sau muoi","bay muoi","tam muoi","chin muoi"} ;
            if (so < 10 ) {
                return donVi[so];
            }else if(so < 20){
                return "muoi" + donVi[so - 10];
            }else if(so < 100){
                int hangChucIndex = so / 10;
                int donViIndex = so % 10;
                return hangChuc[hangChucIndex] + " "+ donVi[donViIndex];
            }else{
                return "So qua lon !";
            }
    }
}
