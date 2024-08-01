package repository;

import model.BenhAn;

import java.time.LocalDate;
import java.util.List;

public interface IBenhAnRepository {
    List<BenhAn> findAll();

    boolean addBenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, int phiNamVien);

    boolean addBenhAnVIP(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, String goiVIP, String thoiHanVIP);

    void removeBenhAn(String maBenhAn);

    BenhAn findByMaBenhAn();

    BenhAn findByMaBenhAn(String maBenhAn);
}
