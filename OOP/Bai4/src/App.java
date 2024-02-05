import java.util.ArrayList;
import java.util.Scanner;

class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String CMND;

    // constructor (hàm khởi tạo)
    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String CMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getCMND() {
        return CMND;
    }
}

class HoGiaDinh {
    private int soThanhVien;
    private int soNha;
    private ArrayList<Nguoi> thanhVien;

    public HoGiaDinh(int soThanhVien, int soNha, ArrayList<Nguoi> thanhVien) {
        this.soNha = soNha;
        this.soThanhVien = soThanhVien;
        this.thanhVien = thanhVien;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public ArrayList<Nguoi> getThanhVien() {
        return thanhVien;
    }
}

class KhuPho {
    private ArrayList<HoGiaDinh> danhSachHo;

    public KhuPho() {
        danhSachHo = new ArrayList<>();
    }

    public void themHoGiaDinh(HoGiaDinh hoGiaDinh) {
        danhSachHo.add(hoGiaDinh);
    }

    public void hienThiThongTinHo() {
        System.out.println("Thông tin các hộ dân trong khu phố:");
        for (HoGiaDinh ho : danhSachHo) {
            System.out.println("Số nhà: " + ho.getSoNha());
            System.out.println("Số thành viên: " + ho.getSoThanhVien());
            System.out.println("Danh sách thành viên: ");
            for (Nguoi nguoi : ho.getThanhVien()) {
                System.out.println("Họ tên: " + nguoi.getHoTen());
                System.out.println("Tuổi: " + nguoi.getTuoi());
                System.out.println("Nghề nghiệp: " + nguoi.getNgheNghiep());
                System.out.println("Số CMND: " + nguoi.getCMND());
            }
            System.out.println();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhập số hộ dân trong khu phố : ");
        int n = scanner.nextInt();

        KhuPho khuPho = new KhuPho();
        for (int i = 0; i < n; i++) {
            System.err.println("Nhập thông tin hộ dân thứ " + (i + 1) + ": ");
            System.err.print("Nhập số nhà: ");
            int soNha = scanner.nextInt();
            System.err.print("Nhập số thành viên trong hộ: ");
            int soThanhVien = scanner.nextInt();

            ArrayList<Nguoi> thanhVien = new ArrayList<>();
            for (int j = 0; j < soThanhVien; j++) {
                System.err.println("Nhập thông tin thành viên thứ " + (j + 1) + ": ");
                scanner.nextLine();
                System.err.print("Họ tên: ");
                String hoTen = scanner.nextLine();
                System.err.print("Tuổi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();
                System.out.print("Số CMND: ");
                String CMND = scanner.nextLine();

                Nguoi nguoi = new Nguoi(hoTen, tuoi, ngheNghiep, CMND);
                thanhVien.add(nguoi);
            }
            HoGiaDinh hoGiaDinh = new HoGiaDinh(soThanhVien, soNha, thanhVien);
            khuPho.themHoGiaDinh(hoGiaDinh);
        }
        khuPho.hienThiThongTinHo();

    }
}
