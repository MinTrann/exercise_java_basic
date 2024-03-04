import java.util.Scanner;

class Student {
  private String hoTen;
  private String diaChi;
  private int tuoi;
  private String gioiTinh;
   
  public Student(String hoTen, String diaChi, int tuoi, String gioiTinh) {
    this.hoTen = hoTen;
    this.diaChi = diaChi;
    this.tuoi = tuoi;
    this.gioiTinh = gioiTinh;
  }
  public String getHoTen() {
    return hoTen;
  }
  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }
  public String getDiaChi() {
    return diaChi;
  }
  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }
  public int getTuoi() {
    return tuoi;
  }
  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
  public String getgioiTinh() {
    return gioiTinh;
  }
  public void setgioiTinh(String gioiTinh) {
    this.gioiTinh = gioiTinh;
  }

}
public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ho ten : ");
    String hoTen = scanner.nextLine();
    System.err.print("Nhap dia chi :");
    String diaChi = scanner.nextLine();
    System.err.print("Nhap gioi tinh : ");
    String gioiTinh = scanner.nextLine();
    System.err.print("Nhap tuoi : ");
    int tuoi = scanner.nextInt();
    scanner.nextLine();
    Student student1 = new Student(hoTen, diaChi, tuoi, gioiTinh);
    System.err.println("=====Kiem tra lai thong ban vua nhap ============");
    System.out.println(student1.getHoTen());
    System.out.println(student1.getDiaChi());
    System.out.println(student1.getgioiTinh());
    System.out.println(student1.getTuoi());
  }
}
 