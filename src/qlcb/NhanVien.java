package qlcb;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", CongViec='" + congViec + '\'' +
                '}';
    }
}
