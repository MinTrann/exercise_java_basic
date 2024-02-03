import java.util.ArrayList;
import java.util.Scanner;

class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void hienThiThongTin() {
        System.out.println("Ma Tai Lieu: " + maTaiLieu);
        System.out.println("Nha Xuat Ban: " + nhaXuatBan);
        System.out.println("So ban phat hanh: " + soBanPhatHanh);
    }
}

class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
    }
}

class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.thangPhatHanh = thangPhatHanh;
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("So phat hanh: " + soPhatHanh);
        System.out.println("Thang phat hanh: " + thangPhatHanh);
    }
}

class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh);
    }
}

class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        danhSachTaiLieu = new ArrayList<>();
    }

    public void themTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    public void xoaTaiLieu(String maTaiLieu) {
        for (TaiLieu tl : danhSachTaiLieu) {
            if (tl.getMaTaiLieu().equals(maTaiLieu)) {
                danhSachTaiLieu.remove(tl);
                System.out.println("Xoá thành công tài liệu có mã: " + maTaiLieu);
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu có mã: " + maTaiLieu);
    }

    public void hienThiThongTinTaiLieu() {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            System.out.println(taiLieu.toString());
        }
    }

    public void timKiemTheoLoai(String loai) {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equals(loai)) {
                System.out.println(taiLieu.toString());
            }
        }
    }
}

public class App {

    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập loại tài liệu (Sach, TapChi, Bao): ");
                    String loai = scanner.nextLine();
                    System.out.print("Nhập mã tài liệu: ");
                    String maTaiLieu = scanner.nextLine();
                    System.out.print("Nhập tên nhà xuất bản: ");
                    String tenNhaXuatBan = scanner.nextLine();
                    System.out.print("Nhập số bản phát hành: ");
                    int soBanPhatHanh = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    if (loai.equalsIgnoreCase("Sach")) {
                        System.out.print("Nhập tên tác giả: ");
                        String tenTacGia = scanner.nextLine();
                        System.out.print("Nhập số trang: ");
                        int soTrang = scanner.nextInt();
                        quanLySach
                                .themTaiLieu(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                    } else if (loai.equalsIgnoreCase("TapChi")) {
                        System.out.print("Nhập số phát hành: ");
                        int soPhatHanh = scanner.nextInt();
                        System.out.print("Nhập tháng phát hành: ");
                        int thangPhatHanh = scanner.nextInt();
                        quanLySach.themTaiLieu(
                                new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                    } else if (loai.equalsIgnoreCase("Bao")) {
                        System.out.print("Nhập ngày phát hành: ");
                        String ngayPhatHanh = scanner.nextLine();
                        quanLySach.themTaiLieu(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                    } else {
                        System.out.println("Loại tài liệu không hợp lệ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã tài liệu cần xoá: ");
                    String maXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieu(maXoa);
                    break;
                case 3:
                    quanLySach.hienThiThongTinTaiLieu();
                    break;
                case 4:
                    System.out.print("Nhập loại tài liệu cần tìm kiếm (Sach, TapChi, Bao): ");
                    String loaiTimKiem = scanner.nextLine();
                    quanLySach.timKiemTheoLoai(loaiTimKiem);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
        scanner.close();
    }
}