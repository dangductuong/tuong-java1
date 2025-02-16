import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        QuanLyThuVien quanLyThuVien = new QuanLyThuVien();

        // Tạo sách
        quanLyThuVien.themSach(new Sach("Lập trình Java", "S001", false));
        quanLyThuVien.themSach(new Sach("Cơ sở dữ liệu", "S002", true));
        quanLyThuVien.themSach(new Sach("Hệ điều hành", "S003", false));

        // Tạo người đọc
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        quanLyThuVien.themNguoiDoc(new NguoiDoc("Nguyễn Văn A", "0123456789", "a@gmail.com", "SV001", sdf.parse("25-11-2024"), sdf.parse("30-11-2024")));
        quanLyThuVien.themNguoiDoc(new NguoiDoc("Trần Thị B", "0987654321", "b@gmail.com", "SV002", sdf.parse("26-11-2024"), sdf.parse("01-12-2024")));

        // In danh sách người đọc
        System.out.println("Danh sách người đọc:");
        quanLyThuVien.inDanhSachNguoiDoc();

        // Sắp xếp người đọc theo ngày mượn
        quanLyThuVien.sapXepNguoiDocTheoNgayMuon();
        System.out.println("Danh sách người đọc sau khi sắp xếp:");
        quanLyThuVien.inDanhSachNguoiDoc();

        // Kiểm tra sách còn trong thư viện
        System.out.println("Danh sách sách chưa mượn:");
        quanLyThuVien.kiemTraSach();
    }
}
