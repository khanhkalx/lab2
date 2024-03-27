package Model;

public class ChuDe {
    private int IdChuDe;
    private String TenChuDe;
    private String  HinhChuDe;

    public ChuDe(int idChuDe, String tenChuDe, String hinhChuDe) {
        IdChuDe = idChuDe;
        TenChuDe = tenChuDe;
        HinhChuDe = hinhChuDe;
    }
    public ChuDe(){

    }

    public int getIdChuDe() {
        return IdChuDe;
    }

    public void setIdChuDe(int idChuDe) {
        IdChuDe = idChuDe;
    }

    public String getTenChuDe() {
        return TenChuDe;
    }

    public void setTenChuDe(String tenChuDe) {
        TenChuDe = tenChuDe;
    }

    public String getHinhChuDe() {
        return HinhChuDe;
    }

    public void setHinhChuDe(String hinhChuDe) {
        HinhChuDe = hinhChuDe;
    }
}
