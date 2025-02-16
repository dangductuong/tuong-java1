public class NguoiQuanLi implements Printable{
    private String hoTen;
    private String soDienThoai;
    private String email;
    private String CCCD;

    public NguoiQuanLi(String hoTen, String soDienThoai, String email, String CCCD){
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.CCCD = CCCD;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getSoDienThoai(){
        return soDienThoai;
    }
    public String getEmail(){
        return email;
    }
    public String getCCCD(){
        return CCCD;
    }

    @Override
    public void print (){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("So dienthoai: "+soDienThoai);
        System.out.println("Email: "+email);
        System.out.println("CCCD: "+CCCD);
    }
}
