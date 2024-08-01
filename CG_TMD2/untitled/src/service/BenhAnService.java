package service;

import model.BenhAn;
import repository.BenhAnReposiroty;
import repository.IBenhAnRepository;

import java.time.LocalDate;
import java.util.List;

public class BenhAnService implements IBenhAnService{

    private final IBenhAnRepository benhAnRepository = new BenhAnReposiroty();
    @Override
    public List<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public boolean addBenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        return false;
    }

    @Override
    public boolean addBenhAnVIP(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, String goiVIP, String thoiHanVIP) {
        return false;
    }

    @Override
    public void removeBenhAn(String maBenhAn) {
         benhAnRepository.removeBenhAn(maBenhAn);
    }
}
