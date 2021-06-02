package qlcb;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", diaChi='" + super.getDiaChi() + '\'' +
                ", nganhdaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
