import java.util.Date;
public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double diemTX1;
    private double diemTX2;
    private double diemKTHP;
    private int soTietNghi;

    // Constructor
    public Student(String ten, int namSinh, String diaChi, double diemTX1, double diemTX2, double diemKTHP, int soTietNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.diemTX1 = diemTX1;
        this.diemTX2 = diemTX2;
        this.diemKTHP = diemKTHP;
        this.soTietNghi = soTietNghi;
    }

    // Getter và setter (đóng gói dữ liệu)
    // ... (Tự viết các getter và setter cho từng thuộc tính)

    // Phương thức tính GPA
    public double tinhGPA() {
        return diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP * 0.5;
    }

    // Phương thức hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        int tuoi = new Date().getYear() + 1900 - namSinh; // Tính tuổi dựa trên năm hiện tại
        System.out.printf("%-10s %-5d %-20s %-10.2f %-10.2f %-10.2f %-10.2f %d\n",
                ten, tuoi, diaChi, diemTX1, diemTX2, diemKTHP, tinhGPA(), soTietNghi);
    }
}
