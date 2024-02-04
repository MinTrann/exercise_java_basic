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
            System.out.println("So nha: " + ho.getSoNha());
            System.out.println("So thanh vien: " + ho.getSoThanhVien());
            System.out.println("Danh sach thanh vien: ");
            for (Nguoi nguoi : ho.getThanhVien()) {
                System.out.println("Ho ten: " + nguoi.getHoTen());
                System.out.println("Tuoi: " + nguoi.getTuoi());
                System.out.println("Nghe nghiep: " + nguoi.getNgheNghiep());
                System.out.println("So CMND: " + nguoi.getCMND());
            }
            System.out.println();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    }
}
