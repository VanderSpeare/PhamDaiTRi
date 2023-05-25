import java.util.Scanner;
import java.util.ArrayList;

public class phongHoc{
    public String maPhong;
    public String dayNha;
    public float dienTich;/*m2*/
    public int soBongDen;

phongHoc(String maPhong,String dayNha,float dienTich,int soBongDen){
    super();
    this.maPhong = maPhong;
    this.dayNha = dayNha;
    this.dienTich = dienTich;
    this.soBongDen = soBongDen;
}
public String getMaPhong(){
    return maPhong;
}
public String getDayNha(){
    return dayNha;
}
public float getDienTich(){
    return dienTich;
}
public int getSoBongDen(){
    return soBongDen;
}
public void nhap() {
    Scanner sc = new Scanner(System.in);  
    System.out.println("nhập số bóng đèn:  ");
    sc.mayChieu = scanner.nextLine();
     
    System.out.println("nhập diện tích phòng học:  ");
    sc.dienTich =sc.nextLine();
      
    System.out.println("Nhập Số Máy Tính");
    sc.mayTinh = sc.nextLine();
}
}
