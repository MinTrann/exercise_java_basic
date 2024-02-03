import java.util.ArrayList;
import java.util.Scanner;

class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }
}

class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

    public void themMoiThiSinh(ThiSinh thiSinh) {
        danhSachThiSinh.add(thiSinh);
    }

    public void hienThiThongTin() {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            System.out.println("Số báo danh: " + thiSinh.getSoBaoDanh());
            System.out.println("Họ tên: " + thiSinh.getHoTen());
            System.out.println("Địa chỉ: " + thiSinh.getDiaChi());
            System.out.println("Mức ưu tiên: " + thiSinh.getMucUuTien());
            System.out.println("Khối thi: " + getKhoiThi(thiSinh));
            System.out.println("--------------");
        }
    }

    public void timKiemTheoSoBaoDanh(int soBaoDanh) {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh() == soBaoDanh) {
                System.out.println("Số báo danh: " + thiSinh.getSoBaoDanh());
                System.out.println("Họ tên: " + thiSinh.getHoTen());
                System.out.println("Địa chỉ: " + thiSinh.getDiaChi());
                System.out.println("Mức ưu tiên: " + thiSinh.getMucUuTien());
                System.out.println("Khối thi: " + getKhoiThi(thiSinh));
                return;
            }
        }
        System.out.println("Không tìm thấy thí sinh với số báo danh " + soBaoDanh);
    }

    private String getKhoiThi(ThiSinh thiSinh) {
        if (thiSinh instanceof ThiSinhKhoiA) {
            return "Khối A (Toán, Lý, Hoá)";
        } else if (thiSinh instanceof ThiSinhKhoiB) {
            return "Khối B (Toán, Hoá, Sinh)";
        } else if (thiSinh instanceof ThiSinhKhoiC) {
            return "Khối C (Văn, Sử, Địa)";
        }
        return "Không xác định";
    }
}

class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
}

class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
}

class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
}

public class App {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm mới thí sinh
                    System.out.print("Nhập số báo danh: ");
                    int soBaoDanh = scanner.nextInt();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.next();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.next();
                    System.out.print("Nhập mức ưu tiên: ");
                    int mucUuTien = scanner.nextInt();
                    System.out.print("Chọn khối thi (A/B/C): ");
                    char khoiThi = scanner.next().charAt(0);
                    ThiSinh thiSinh = null;
                    if (khoiThi == 'A') {
                        thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
                    } else if (khoiThi == 'B') {
                        thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
                    } else if (khoiThi == 'C') {
                        thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
                    }

                    tuyenSinh.themMoiThiSinh(thiSinh);
                    System.out.println("Thêm mới thành công!");
                    break;

                case 2:
                    // Hiển thị thông tin thí sinh
                    tuyenSinh.hienThiThongTin();
                    break;

                case 3:
                    // Tìm kiếm theo số báo danh
                    System.out.print("Nhập số báo danh cần tìm kiếm: ");
                    int soBaoDanhCanTim = scanner.nextInt();
                    tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanhCanTim);
                    break;

                case 4:
                    // Thoát khỏi chương trình
                    System.out.println("Đã thoát khỏi chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}