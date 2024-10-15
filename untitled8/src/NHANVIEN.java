public class NHANVIEN {
    private String ten;
    private int tuoi;
    private String sdt;
    public NHANVIEN( String ten, int tuoi, String sdt) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
