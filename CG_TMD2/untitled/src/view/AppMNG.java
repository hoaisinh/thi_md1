package view;

import controller.BenhVienController;

import java.util.Scanner;

public class AppMNG {
    private final static Scanner scanner =new Scanner(System.in);
    static BenhVienController benhVienController = new BenhVienController();
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu(){
        do {
            System.out.println(
                    """
                    ----------Home Page--------
                    1. Thêm Mới
                    2. Xóa
                    3. Xem danh sách bệnh án
                    4. Thoát
                    Nhập lựa chọn: \s"""
            );

            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 3:benhVienController.displayALlBenhAn();break;
                case 2:benhVienController.deleteBenhAn();break;

            }
        }while (true);
    }

}
