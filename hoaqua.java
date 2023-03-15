import java.util.Date;
import java.util.Scanner;
public class HoaQua {
    public double giaban;
    public double soluong;
    public HoaQua() {}
    public HoaQua(double giaban,double soluong) {
        this.giaban=giaban;
        this.soluong=soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public class quacam extends HoaQua {
        public quacam() {}
        public Date ngaynhap;
        public String nguongoc;
        public Date getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(Date ngaynhap) {
            this.ngaynhap = ngaynhap;
        }

        public String getNguongoc() {
            return nguongoc;
        }

        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }
    }
    public class camcaophong extends quacam {
        public camcaophong() {}
        public double Doanhthu;

        public double getDoanhthu() {
            return Doanhthu;
        }

        public void setDoanhthu(double Doanhthu) {
            this.Doanhthu = Doanhthu;
        }
    }
    public class camsanh extends quacam {
        public camsanh() {
        }
        public double doanhthu2;

        public double getDoanhthu2() {
            return doanhthu2;
        }

        public void setDoanhthu2(double doanhthu2) {
            this.doanhthu2 = doanhthu2;
        }

    }
    public class quatao extends HoaQua{
        public quatao() {}
        public Date ngaynhap;
        public String nguongoc;
        public Date getNgaynhap() {
            return ngaynhap;
        }

        public void setNgaynhap(Date ngaynhap) {
            this.ngaynhap = ngaynhap;
        }

        public String getNguongoc() {
            return nguongoc;
        }

        public void setNguongoc(String nguongoc) {
            this.nguongoc = nguongoc;
        }
    }
    public void main(String[] args) {
        Scanner n = new Scanner(System.in);
        HoaQua hoaqua=new HoaQua();
        hoaqua.getGiaban();
        hoaqua.getSoluong();
        quacam qc = new quacam();
        qc.getSoluong();
        qc.getNgaynhap();
        camcaophong cp = new camcaophong();
        cp.getDoanhthu();
        camsanh cs = new camsanh();
        cs.getDoanhthu2();
        quatao qt = new quatao();
        qt.getNgaynhap();
        qt.getNguongoc();
    }
}