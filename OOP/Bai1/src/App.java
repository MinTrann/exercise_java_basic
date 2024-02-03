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
        return "Họ tên: " + hoTen + ",Tuổi: " + tuoi + ",Gioi tinh: " + gioiTinh + ",Đại chỉ: " + diachi;
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
        return super.getThongTin() + ", Ngành đào tạo: " + nganhDaoTao;
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
        return super.getThongTin() + ", Công việc: " + congViec;
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
        System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
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
            System.out.println("1. Thêm mới cán bộ ");
            System.out.println("2. Tìm kiếm theo họ tên ");
            System.out.println("3. Hiểnt thị dánh sách cán bộ ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại cán bộ (1: Công nhân, 2: Kỹ sư, 3: Nhân viên): ");
                    int loaiCanBo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nhập họ tên : ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhập tuổi : ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String diaChi = scanner.nextLine();

                    if (loaiCanBo == 1) {
                        System.out.print("Nhập bậc công nhân(1-10): ");
                        int bac = scanner.nextInt();
                        qlcb.themMoiCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi));
                    } else if (loaiCanBo == 2) {
                        System.out.print("Nhập ngành đào tạo kỹ sư: ");
                        String nganhDaoTao = scanner.nextLine();
                        qlcb.themMoiCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi));
                    } else if (loaiCanBo == 3) {
                        System.out.println("Nhập công việc nhân viên: ");
                        String congViec = scanner.nextLine();
                        qlcb.themMoiCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi));
                    }
                    break;
                case 2:
                    System.out.println("Nhập họ tên cần tìm : ");
                    String tenCanTim = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(tenCanTim);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình .");
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn chức năng khác !");
                    break;
            }
        }
    }
}
