import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

    public class QuanLyThuVien {
        private List<NguoiDoc> danhSachNguoiDoc = new ArrayList<>();
        private List<Sach> danhSachSach = new ArrayList<>();

        public void themNguoiDoc(NguoiDoc nguoiDoc) {
            danhSachNguoiDoc.add(nguoiDoc);
        }

        public void themSach(Sach sach) {
            danhSachSach.add(sach);
        }

        public void timNguoiDocTheoNgay(Date ngayMuon) {
            for (NguoiDoc nd : danhSachNguoiDoc) {
                if (nd.getNgayMuon().equals(ngayMuon)) {
                    nd.print();
                }
            }
        }

        public void sapXepNguoiDocTheoNgayMuon() {
            danhSachNguoiDoc.sort(Comparator.comparing(NguoiDoc::getNgayMuon));
        }

        public void inDanhSachNguoiDoc() {
            for (NguoiDoc nd : danhSachNguoiDoc) {
                nd.print();
                System.out.println("----------------------");
            }
        }

        public void kiemTraSach() {
            for (Sach s : danhSachSach) {
                if (!s.getDaMuon()) {
                    s.print();
                    System.out.println("----------------------");
                }
            }
        }
    }


