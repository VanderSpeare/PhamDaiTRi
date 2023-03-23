package hinh;
import java.util.ArrayList;
import java.util.Date;
public class Hinh {
    public double dienTich(double dt) {
        System.out.println("Dien tich hinh: ");
        return dt;
    }
    public static class HinhChuNhat extends Hinh {
        float cd;
        public float getcd() {
            return cd;
        float cr;
        public float getCr() {
            return cr;
        }
        public HinhChuNhat() {}
        public HinhChuNhat(float cd,float cr) {
            this.cd=cd;
            this.cr=cr;
        }
        public void setCd(float cd) {
            this.cd = cd;
        public void setCr(float cr) {
            this.cr = cr;
        }


        @Override
        public double dienTich(double dt) {
            return dt=cd*cr;
        }
        @Override
        public String toString() {
            return "Chieu dai"+cd+"Chieu rong"+cr;
        }
    }
    public static class HinhTron extends Hinh {
        public float r;
        public HinhTron() {}
        public HinhTron(float r) {
            this.r=r;
        }

        public float getR() {
            return r;
        }

        public void setR(float r) {
            this.r = r;
        }
        @Override
        //khai báo phương thức nhằm ghi đè một khai báo phương thức trong một siêu kiểu.
        // Nếu một phương thức được chú thích với loại chú thích này, trình biên dịch được yêu cầu tạo thông báo lỗi
        public double dienTich(double dt) {
            return dt=r*r*Math.PI;
        }
        @Override
        public String toString() {
            return "Ban kinh"+r;
        }
    }
    public class DanhSachHinh {
        ArrayList<Hinh> dshinh = new ArrayList<Hinh>();
        // tham khảo trên w3school
        public DanhSachHinh() {}
        public void Them(ArrayList Hinh) {
            System.out.println("Them");
        }
        public void InDanhSach() {
            System.out.println("In danh sach"+dshinh);
        }
    }
    public static void main(String[] args) {
        Hinh hinh = new Hinh();
        hinh.dienTich(0);
        hinh = new HinhChuNhat();
        hinh.dienTich(0);
        hinh = new HinhTron();
        hinh.dienTich(0);
    }
}