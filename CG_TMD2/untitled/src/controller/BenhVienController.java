package controller;

import common.Validation;
import model.BenhAn;
import model.BenhAnThuong;
import service.BenhAnService;
import service.IBenhAnService;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class BenhVienController {
    private final IBenhAnService benhAnService = new BenhAnService();
    private final Scanner scanner = new Scanner(System.in);
    // Biến nhập input từ màn hình
    public String maBenhAn,maBenhNhan, tenBenhNhan, lyDoNhapVien;
    public int phiNamVien;

    public String ngayNhapVien,ngayRaVien;


    // Nhập liệu từ màn hình console
    public void inputData(){
        String temp = "";

        do{
            System.out.print("Nhập mã bệnh án (BA-XXX): ");
            temp = scanner.nextLine();
        }while (!Validation.regStudentCode(temp));
        maBenhAn = temp;
        do{
            System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
            temp = scanner.nextLine();
        }while (!Validation.regStudentCode(temp));
        maBenhNhan = temp;

        do{
            System.out.print("Nhập mã tên bệnh nhân: ");
            temp = scanner.nextLine();
        }while (!Validation.regStudentCode(temp));
        tenBenhNhan = temp;

        do{
            System.out.print("Ngày nhập viện(dd/mm/yyyy): ");
            temp = scanner.nextLine();
        }while (!Validation.regStudentCode(temp));
        ngayNhapVien = temp;

        do{
            System.out.print("Ngày ra viện (dd/mm/yyyy): ");
            temp = scanner.nextLine();
        }while (!Validation.regStudentCode(temp));
        ngayRaVien = temp;
        System.out.print("Lý Do Nhập Viện: ");
        lyDoNhapVien = scanner.nextLine();

        System.out.print("Viện phí: ");
         phiNamVien = Integer.parseInt(scanner.nextLine());
    }
    public void displayALlBenhAn(){
        List<BenhAn> benhAns = benhAnService.findAll();
        for(BenhAn benhAn : benhAns){
            System.out.println(benhAn.toString());
        }
    }
    public void deleteBenhAn() {
        System.out.println("Nhập Mã Bệnh Án muốn xóa");
        String maBenhAn = scanner.nextLine();
        benhAnService.removeBenhAn(maBenhAn);

    }

}
