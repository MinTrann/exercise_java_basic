import java.util.ArrayList;
import java.util.Scanner;

  class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String toString() {
        return "HocSinh [hoTen=" + hoTen + ",tuoi=" + tuoi + ",queQuan=" + queQuan + "]";
    }
}

  class QuanLyHocSinh {
    private ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themMoiHocSinh() {
        System.out.println("Nhap thong tin hoc sinh: ");
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Que quan: ");
        String queQuan = scanner.nextLine();

        HocSinh hocSinh = new HocSinh(hoTen, tuoi, queQuan);
        danhSachHocSinh.add(hocSinh);
        System.out.println("Da them hoc sinh: " + hocSinh);
    }

    public void hienThiHocSinh20Tuoi() {
        System.out.println("Cac hoc sinh 20 tuoi: ");
        for (HocSinh hocSinh : danhSachHocSinh) {
             if (hocSinh.getTuoi() == 20) {
                System.out.println(hocSinh);
             }
           
        }
    }

    public int demHocSin23TuoiQueDN() {
        int cout = 0;
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.getTuoi() == 20 && hocSinh.getQueQuan().equals("DN")) {
                cout++;
            }
        }
        return cout;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("======QUAN LY HOC SINH================================");
            System.out.println("1. Them hoc sinh moi");
            System.out.println("2. Hien thi hoc sinh 20 tuoi");
            System.out.println("3. Dem so luong hoc sinh 23 tuoi que o DN");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    quanLyHocSinh.themMoiHocSinh();
                    break;
                case 2:
                    quanLyHocSinh.hienThiHocSinh20Tuoi();
                    break;
                case 3:
                    quanLyHocSinh.demHocSin23TuoiQueDN();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh! ");

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai !");
                    break;
            }
        } while (luaChon != 0);
        scanner.close();
    }
}
