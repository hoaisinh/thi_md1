package model;

import java.time.LocalDate;

public class BenhAnVIP extends BenhAn{
    private String goiVIP;
    private String thoiHanVIP;

    public BenhAnVIP(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String goiVIP, String thoiHanVIP) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.goiVIP = goiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }
    public String BenhAnThuongToString(){
        return super.BenhAnToString()+","+goiVIP+","+thoiHanVIP;
    }
}
