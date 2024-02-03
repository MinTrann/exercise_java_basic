import java.util.ArrayList;

class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCMND;

    // Constructor
    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    // Getter method
    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }
    // Override toString method for displaying information

    @Override
    public String toString() {
        return "Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Nghề nghiệp: " + ngheNghiep + ",  Số CMND: " + soCMND;
    }
}

class HoGiaDinh {
    private int soThanhVien;
    private int soNha;
    private ArrayList<Nguoi> thanhVienList;

    // Constructor
    public HoGiaDinh(int soThanhVien, int soNha) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.thanhVienList = new ArrayList<>();
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public ArrayList<Nguoi> getThanhVienList() {
        return thanhVienList;
    }

    // Add person to the family
    public void addNguoi(Nguoi nguoi) {
        thanhVienList.add(nguoi);
    }

    // Override toString method for displaying information
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("So nha: " + soNha + ", So thanh vien: " + soThanhVien + "\n");
        for (Nguoi nguoi : thanhVienList) {
            info.append(nguoi.toString()).append("\n");
        }
        return info.toString();
    }
}

class KhuPho {
    private ArrayList<HoGiaDinh> hoGiaDinhList;

    // Contructor
    public KhuPho() {
        this.hoGiaDinhList = new ArrayList<>();
    }

    // Add family to the neighborhood
    public void addHoGiaDinh(HoGiaDinh hoGiaDinh) {
        hoGiaDinhList.add(hoGiaDinh);
    }

    // Display information of all families in the neighborhood
    public void displayInformation() {
        for (HoGiaDinh hoGiaDinh : hoGiaDinhList) {
            System.out.println(hoGiaDinh.toString());
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
