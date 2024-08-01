package model;

import java.time.LocalDate;

public abstract class  BenhAn {
    private int soThuTu;
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenNhan;
    private String ngayNhapVien;

    private String ngayRaVien;
    private String lyDoNhapVien;


    public BenhAn(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenNhan = tenBenNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenNhan() {
        return tenBenNhan;
    }

    public void setTenBenNhan(String tenBenNhan) {
        this.tenBenNhan = tenBenNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return
                "Số thứ tự=" + soThuTu +
                        ", Mã Bệnh Án ='" + maBenhAn + '\'' +
                        ", Mã Bệnh Nhân ='" + maBenhNhan + '\'' +
                        ", Tên Bệnh Nhân =" + tenBenNhan +
                        ", Ngày Nhập Viện ='" + ngayNhapVien + '\''+
                        ", Mã Ra Viện ='" + ngayRaVien + '\'' +
                        ", Lý Do Nhập Viện ='" + lyDoNhapVien + '\''
                ;
    }
    public String BenhAnToString(){
        return getSoThuTu()+","+getMaBenhAn()+","+getMaBenhNhan()+","+getTenBenNhan()+","+getNgayNhapVien()+","+getNgayRaVien()+","+getLyDoNhapVien();
    }

}

