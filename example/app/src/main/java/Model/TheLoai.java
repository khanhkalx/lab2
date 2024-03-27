package Model;

public class TheLoai {

    private String IdTheLoai;
    private int IdChuDe;
    private String TenTheLoai;
    private String HinhTheLoai;

    public TheLoai(){

    }
    public TheLoai(String idTheLoai, int idChuDe, String tenTheLoai, String hinhTheLoai) {
        IdTheLoai = idTheLoai;
        IdChuDe = idChuDe;
        TenTheLoai = tenTheLoai;
        HinhTheLoai = hinhTheLoai;
    }

    public String getIdTheLoai() {
        return IdTheLoai;
    }

    public void setIdTheLoai(String idTheLoai) {
        IdTheLoai = idTheLoai;
    }

    public int getIdChuDe() {
        return IdChuDe;
    }

    public void setIdChuDe(int idChuDe) {
        IdChuDe = idChuDe;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        TenTheLoai = tenTheLoai;
    }

    public String getHinhTheLoai() {
        return HinhTheLoai;
    }

    public void setHinhTheLoai(String hinhTheLoai) {
        HinhTheLoai = hinhTheLoai;
    }
}
