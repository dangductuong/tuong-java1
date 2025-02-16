import java.util.Date;

public class NguoiDoc implements Printable {
    private String hoTen;
    private String soDienThoai;
    private String email;
    private String maSV;
    private Date ngayMuon;
    private Date ngayTra;

    public NguoiDoc(String hoTen, String soDienThoai, String email, String maSV, Date ngayMuon, Date ngayTra) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maSV = maSV;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;

    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public Date getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }
    public Date getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public void print() {
        System.out.println("HoTen: " + hoTen);
        System.out.println("SoDienThoai: " + soDienThoai);
        System.out.println("Email: " + email);
        System.out.println("MaSV: " + maSV);
        System.out.println("NgayMuon: " + ngayMuon);
        System.out.println("NgayTra: " + ngayTra);

    }
}
