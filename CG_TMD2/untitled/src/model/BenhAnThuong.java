package model;

import java.time.LocalDate;

public class BenhAnThuong extends BenhAn{

    private int phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String BenhAnThuongToString(){
        return super.BenhAnToString()+","+phiNamVien;
    }




}
