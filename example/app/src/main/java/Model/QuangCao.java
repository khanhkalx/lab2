package Model;

public class QuangCao {
    private int id;
    private String HinhAnh;
    private String NoiDung;
    private int IdBaiHat;

    public QuangCao() {
    }

    public QuangCao(int id, String hinhAnh, String noiDung, int idBaiHat) {
        this.id = id;
        HinhAnh = hinhAnh;
        NoiDung = noiDung;
        IdBaiHat = idBaiHat;
    }

    public QuangCao(int id, String hinhAnh, String noiDung) {
        this.id = id;
        HinhAnh = hinhAnh;
        NoiDung = noiDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public int getIdBaiHat() {
        return IdBaiHat;
    }

    public void setIdBaiHat(int idBaiHat) {
        IdBaiHat = idBaiHat;
    }
}
