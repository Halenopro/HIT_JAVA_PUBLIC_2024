
import java.util.ArrayList;
import java.util.List;public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Lê Hà", 2005, "Hà Nội", 8.0, 7.5, 9.0, 5));
        students.add(new Student("Phùng Đức Anh", 2005, "Vĩnh Phúc", 6.5, 8.0, 7.5, 3));
        students.add(new Student("Nguyễn Quốc Thái", 2005, "Nghệ An", 6.5, 8.0, 7.5, 3));
        students.add(new Student("Lê Thị Nụ", 2005, "Thái Bình", 6.5, 8.0, 7.5, 3));
        students.add(new Student("Nguyễn Thùy Trang", 2005, "Hồ Chí Minh", 6.5, 8.0, 7.5, 3));


        System.out.printf("%-15s %-5s %-20s %-8s %-8s %-8s %-10s %s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");

        for (Student student : students) {
            student.hienThiThongTin();
        }
    }
}
