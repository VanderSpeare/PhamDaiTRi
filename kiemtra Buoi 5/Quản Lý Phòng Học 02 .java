mport java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class QuanLyPhongHoc02 {
    private List<iPhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc02() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void themPhongHoc(PhongHoc phongHoc) {
        if (!danhSachPhongHoc.contains(phongHoc)) {
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Da them thanh cong.");
        } else {
            System.out.println("ma phong nay da ton tai.");
        }
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return phongHoc;
            }
        }
        return null;
    }

    public void inDanhSachPhongHoc() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc);
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongLyThuyet) {
                if (((PhongLyThuyet) phongHoc).MayChieu.isTrue()) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                if (phongHoc.getDienTich() / ((PhongMayTinh) phongHoc).getSoMayTinh() >= 1.5) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongThiNghiem) {
                if (((PhongThiNghiem) phongHoc).isCoBonRua()) {
                    System.out.println(phongHoc);
                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhongHoc, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return phongHoc1.getDayNha().compareTo(phongHoc2.getDayNha());
            }
        });
    }

    public void sapXepTheoDienTichGiamDan() {
        Collections.sort(danhSachPhongHoc, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return Double.compare(phongHoc2.getDienTich(), phongHoc1.getDienTich());
            }
        });
    }

    public void sapXepTheoSoBongDenTangDan() {
        Collections.sort(danhSachPhongHoc, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc phongHoc1, PhongHoc phongHoc2) {
                return Integer.compare(phongHoc1.getSoBongDen(), phongHoc2.getSoBongDen());
            }
        });
    }
}