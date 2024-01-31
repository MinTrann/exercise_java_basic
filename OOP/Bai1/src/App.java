// * Lớp cha CanBo

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diachi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diachi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diachi = diachi;
    }

    public String getThongTin() {
        return "Ho ten: " + hoTen + ",Tuoi: " + tuoi + ",Gioi tinh: " + gioiTinh + ",Diachi: " + diachi;
    }
}

// * Các lớp công nhân kế thừa từ CanBo */
class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diachi) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.bac = bac;
    }

    @Override
    public String getThongTin() {
        return super.getThongTin() + ", Bac: " + bac;
    }
}

class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diachi) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String getThongTin() {
        return super.getThongTin() + ", Nganh dao  tao: " + nganhDaoTao;
    }
}

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diachi) {
        super(hoTen, tuoi, gioiTinh, diachi);
        this.congViec = congViec;
    }

    @Override
    public String getThongTin() {
        return super.getThongTin() + ", Cong viec: " + congViec;
    }
}

// * Lớp quản lý cán bộ */
class QLCB {
    private ArrayList<CanBo> danhScahCanBo;

    public QLCB() {
        danhScahCanBo = new ArrayList<>();
    }

    public void themMoiCanBo(CanBo canBo) {
        danhScahCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhScahCanBo) {
            if (canBo.hoTen.equals(hoTen)) {
                System.out.println(canBo.getThongTin());
                return;
            }
        }
        System.out.println("Khong tim thay can bo co ten : " + hoTen);
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhScahCanBo) {
            System.out.println(canBo.getThongTin());
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("1. Them moi can bo ");
            System.out.println("2. Tim kiem theo ho ten ");
            System.out.println("3. Hien thi danh sach can bo ");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chon loai can bo (1: Cong nhan, 2: Ky su, 3: Nhan vien): ");
                    int loaiCanBo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nhap ho ten : ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap gioi tinh: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhap dia chi ");
                    String diaChi = scanner.nextLine();

                    if (loaiCanBo == 1) {
                        System.out.print("Nhap bac cong nhan (1-10): ");
                        int bac = scanner.nextInt();
                        qlcb.themMoiCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi));
                    } else if (loaiCanBo == 2) {
                        System.out.print("Nhap nganh dao tao ky su: ");
                        String nganhDaoTao = scanner.nextLine();
                        qlcb.themMoiCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi));
                    } else if (loaiCanBo == 3) {
                        System.out.println("Nhap cong viec nhan vien: ");
                        String congViec = scanner.nextLine();
                        qlcb.themMoiCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi));
                    }
                    break;
                case 2:
                    System.out.println("Nhap ho ten can tim : ");
                    String tenCanTim = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(tenCanTim);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    System.out.println("Thoat khoi chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Chuc nang khong hop le, Vui long chon chuc nang khac !");
                    break;
            }
        }
    }
}
