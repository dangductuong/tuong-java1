public class Sach implements Printable {
    private String tenSach;
    private String maSach;
    private Boolean daMuon;
    public Sach(String tenSach, String maSach, Boolean daMuon) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.daMuon = daMuon;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getMaSach() {
        return maSach;
    }
    public Boolean getDaMuon() {
        return daMuon;
    }
    public void setDaMuon(Boolean daMuon) {
        this.daMuon = daMuon;
    }
    @Override
    public void print() {
        System.out.println("TenSach: " + tenSach);
        System.out.println("MaSach: " + maSach);
        System.out.println("Trang thai: " + (daMuon ? " da muon" : "chua muon"));
    }
}
