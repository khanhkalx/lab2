package Model;

public class Album {
    private String IdAlbum;
    private String TenAlbum;
    private String TenCaSiAlbum;
    private String HinhAlbum;
    public String getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        IdAlbum = idAlbum;
    }

    public String getTenAlbum() {
        return TenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        TenAlbum = tenAlbum;
    }

    public String getTenCaSiAlbum() {
        return TenCaSiAlbum;
    }

    public void setTenCaSiAlbum(String tenCaSiAlbum) {
        TenCaSiAlbum = tenCaSiAlbum;
    }

    public String getHinhAlbum() {
        return HinhAlbum;
    }

    public void setHinhAlbum(String hinhAlbum) {
        HinhAlbum = hinhAlbum;
    }



    public Album(){

    }
    public Album(String idAlbum, String tenAlbum, String tenCaSiAlbum, String hinhAlbum) {
        IdAlbum = idAlbum;
        TenAlbum = tenAlbum;
        TenCaSiAlbum = tenCaSiAlbum;
        HinhAlbum = hinhAlbum;
    }
}
