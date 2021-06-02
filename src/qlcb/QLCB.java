package qlcb;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    Scanner scanner = new Scanner(System.in);
    List<CanBo> canBos = new ArrayList<>();
    public void menu() {
        while (true) {
            System.out.println("Moi chon menu: \n1.Them moi can bo \n2.Tim kiem \n3.Hien thi \n4.Thoat");
            int chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse) {
                case  1:
                    themMoiCanBo();
                    break;
                case  2:
                    //funtion tim kiem
                    break;
                case  3:
                    hienThiDanhSach();
                    break;
                case  4:
                    System.exit(1);
                    break;
            }
        }

    }


    public void hienThiDanhSach() {
        for (CanBo canBo : canBos) {
            System.out.println(canBo.toString());
        }
    }

    public void themMoiCanBo() {
        //lay du lieu nguoi dung ve ho ten
        System.out.println("Moi nhap ho ten: ");
        String hoten = scanner.nextLine();

        //lay du lieu nguoi dung ve tuoi
        System.out.println("Moi nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        //lay du lieu nguoi dung ve gioi tinh
        System.out.println("Moi nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        //lay du lieu nguoi dung ve dia chi
        System.out.println("Moi nhap dia chi");
        String diaChi = scanner.nextLine();
        // 1.cong nhan 2. ky su 3. nhan vien
        System.out.println("Chon loại can bo: 1.cong nhan, 2.Ky su 3.nhan vien");
        int loaiCanBo = Integer.parseInt(scanner.nextLine());

        switch (loaiCanBo) {
            case 1:
                System.out.println("Moi nhap bac cong nhan");
                int bac = Integer.parseInt(scanner.nextLine());
                CanBo canBo = new CongNhan(hoten, tuoi, gioiTinh, diaChi, bac);
                canBos.add(canBo);
                break;
            case 2:
                System.out.println("Moi nhap nganh dao tao");
                String nganhDaoTao = scanner.nextLine();
                CanBo kysu = new KySu(hoten, tuoi, gioiTinh, diaChi, nganhDaoTao);
                canBos.add(kysu);
                break;
            case 3:
                System.out.println("Moi nhap cong viec");
                String  congViec = scanner.nextLine();
                CanBo nhanVien = new NhanVien(hoten, tuoi, gioiTinh, diaChi, congViec);
                canBos.add(nhanVien);
                break;
        }
        System.out.println("Them moi thanh cong");
    }

}
