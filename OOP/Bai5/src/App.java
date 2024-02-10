import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Nguoi {
    private String hoTen;
    private int tuoi;
    private String soCMND;

    public Nguoi(String hoTen, int tuoi, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMND = soCMND;
    }

    // Getters and Setters
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
}

class Phong {
    private char loai;
    private int gia;

    public Phong(char loai, int gia) {
        this.loai = loai;
        this.gia = gia;
    }

    public char getLoai() {
        return loai;
    }

    public int getGia() {
        return gia;
    }
}

class KhachSan {
    private Map<String, Nguoi> danhSachKhach;
    private Map<Character, Phong> danhSachPhong;

    public KhachSan() {
        danhSachKhach = new HashMap<>();
        danhSachPhong = new HashMap<>();
        danhSachPhong.put('A', new Phong('A', 500));
        danhSachPhong.put('B', new Phong('B', 300));
        danhSachPhong.put('C', new Phong('C', 100));
    }

    // Thêm mới khách
    public void themKhach(Nguoi nguoi) {
        danhSachKhach.put(nguoi.getSoCMND(), nguoi);
    }

    // Xoá khách theo số chứng minh nhân dân
    public void xoaKhach(String soCMND) {
        danhSachKhach.remove(soCMND);
    }

    // Tính tiền thuê phòng cho khách theo số chứng minh nhân dân
    public int tinhTienThuePhong(String soCMND, int soNgayThue, char loaiPhong) {
        if (danhSachKhach.containsKey(soCMND) && danhSachPhong.containsKey(loaiPhong)) {
            Phong phong = danhSachPhong.get(loaiPhong);
            return soNgayThue * phong.getGia();
        } else {
            return -1; // Không tìm thấy thông tin phòng hoặc khách
        }
    }
}

public class App {
    public static void main(String[] args) {
        KhachSan khachSan = new KhachSan();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("======== MENU ========");
            System.out.println("1. Thêm mới khách");
            System.out.println("2. Xoá khách theo CMND");
            System.out.println("3. Tính tiền thuê phòng cho khách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm mới khách
                    System.out.print("Nhập họ tên khách: ");
                    scanner.nextLine();
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi khách: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Nhập số CMND khách: ");
                    scanner.nextLine();
                    String soCMND = scanner.nextLine();

                    Nguoi khach = new Nguoi(hoTen, tuoi, soCMND);
                    khachSan.themKhach(khach);
                    break;

                case 2:
                    // Xoá khách theo CMND
                    System.out.print("Nhập số CMND khách cần xoá: ");
                    scanner.nextLine();
                    String cmndXoa = scanner.nextLine();
                    khachSan.xoaKhach(cmndXoa);
                    break;

                case 3:
                    // Tính tiền thuê phòng cho khách
                    System.out.print("Nhập số CMND khách: ");
                    scanner.nextLine();
                    String cmndTinhTien = scanner.nextLine();
                    System.out.print("Nhập số ngày thuê: ");
                    int soNgayThue = scanner.nextInt();
                    System.out.print("Nhập loại phòng (A/B/C): ");
                    char loaiPhong = scanner.next().charAt(0);

                    int tienThuePhong = khachSan.tinhTienThuePhong(cmndTinhTien, soNgayThue, loaiPhong);
                    if (tienThuePhong != -1) {
                        System.out.println("Tiền thuê phòng của khách: $" + tienThuePhong);
                    } else {
                        System.out.println("Không tìm thấy thông tin phòng hoặc khách.");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
