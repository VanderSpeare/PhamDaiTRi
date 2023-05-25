
public class phongThucHanh extends phongHoc{
    phongThucHanh(String maPhong, String dayNha, float dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
    }
    public int mayTinh;
    public void setMayTinh() {
        this.mayTinh = mayTinh;
    }
    /**
     * @return
     */
    public int getMayTinh(){
        return mayTinh;
    }
    while(soBongDen % dienTich >= 1/10 )
    { 
            if(mayTinh % dienTich == 1 ){
            system.out.println(" Phòng Học Đạt đủ số máy ");
            }else{
            system.out.println(" Phòng yếu ");
        }
    }
}