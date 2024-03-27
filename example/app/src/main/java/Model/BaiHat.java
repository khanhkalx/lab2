package Model;

public class BaiHat {
    private int IdBaiHat;
    private String IdAlbum;
    private String IdTheLoai;
    private String IdPLaylist;

    private String TenBaiHat;
    private String HinhBaiHat;
    private String CaSi;
    private String LinkBaiHat;
    private int like;

    public BaiHat(int idBaiHat, String tenBaiHat, String hinhBaiHat, String caSi, String linkBaiHat) {
        IdBaiHat = idBaiHat;
        TenBaiHat = tenBaiHat;
        HinhBaiHat = hinhBaiHat;
        CaSi = caSi;
        LinkBaiHat = linkBaiHat;
    }

    public int getIdBaiHat() {
        return IdBaiHat;
    }

    public void setIdBaiHat(int idBaiHat) {
        IdBaiHat = idBaiHat;
    }

    public String getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        IdAlbum = idAlbum;
    }

    public String getIdTheLoai() {
        return IdTheLoai;
    }

    public void setIdTheLoai(String idTheLoai) {
        IdTheLoai = idTheLoai;
    }

    public String getIdPLaylist() {
        return IdPLaylist;
    }

    public void setIdPLaylist(String idPLaylist) {
        IdPLaylist = idPLaylist;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }

    public String getHinhBaiHat() {
        return HinhBaiHat;
    }

    public void setHinhBaiHat(String hinhBaiHat) {
        HinhBaiHat = hinhBaiHat;
    }

    public String getCaSi() {
        return CaSi;
    }

    public void setCaSi(String caSi) {
        CaSi = caSi;
    }

    public String getLinkBaiHat() {
        return LinkBaiHat;
    }

    public void setLinkBaiHat(String linkBaiHat) {
        LinkBaiHat = linkBaiHat;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
