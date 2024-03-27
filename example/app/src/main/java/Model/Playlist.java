package Model;

public class Playlist {
    private String Idplaylist;
    private String Ten;
    private String Hinhnen;
    private String icon;
    private Playlist(){

    }

    public Playlist(String idplaylist, String ten, String hinhnen, String icon) {
        Idplaylist = idplaylist;
        Ten = ten;
        Hinhnen = hinhnen;
        this.icon = icon;
    }

    public String getIdplaylist() {
        return Idplaylist;
    }

    public void setIdplaylist(String idplaylist) {
        Idplaylist = idplaylist;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getHinhnen() {
        return Hinhnen;
    }

    public void setHinhnen(String hinhnen) {
        Hinhnen = hinhnen;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
