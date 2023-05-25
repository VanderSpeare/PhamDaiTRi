public class phongThiNghiem extends phongHoc{
    phongThiNghiem(String maPhong,String dayNha,float dienTich,int soBongDen){
    super(maPhong,dayNha,dienTich,soBongDen);
    public int bonRua;
    public void setBonRua() {
        this.bonRua = bonRua;
    }
    /**
     * @return
     */
    public int getBonRua(){
        return bonRua;
    }
    }
    if(boolean  isBonRua = true)
    {
        if(soBongDen % dienTich >= 1/10 ){
            system.out.println(" Phòng Học Đạt Chuẩn ");
        }
    }

    public boolean isBonRua() {
        return isBonRua;
    }
    public void setBonRua(boolean isBonRua) {
        this.isBonRua = isBonRua;
    }}