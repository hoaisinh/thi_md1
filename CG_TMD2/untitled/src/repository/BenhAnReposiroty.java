package repository;

import common.IOStream;
import model.BenhAn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BenhAnReposiroty implements IBenhAnRepository{

private final static List<BenhAn> benhAn = new ArrayList<>();
    @Override
    public List<BenhAn> findAll() {
        return IOStream.listBenhANFromFile();
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
        List<BenhAn> list = IOStream.listBenhANFromFile();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaBenhAn() == maBenhAn){
                list.remove(i);
                break;
            }
        }
        IOStream.updateListBenhAn(list);
    }

    @Override
    public BenhAn findByMaBenhAn() {
        return null;
    }

    @Override
    public BenhAn findByMaBenhAn(String maBenhAn) {
        List<BenhAn> list = IOStream.listBenhANFromFile();
        for (BenhAn benhAn:list){
            if(benhAn.getMaBenhAn() == maBenhAn){
                return benhAn;
            }
        }
        return  null;
    }


}
