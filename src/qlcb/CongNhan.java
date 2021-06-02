package qlcb;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", Bac='" + bac + '\'' +
                '}';
    }
}
