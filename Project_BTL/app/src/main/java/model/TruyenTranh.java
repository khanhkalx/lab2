package model;

import org.json.JSONException;
import org.json.JSONObject;

public class TruyenTranh {
    private String tenTruyen;
    private String tenChap;
    private String LinkAnh;
    private String body;
    public TruyenTranh(){}
    public TruyenTranh(JSONObject o) throws JSONException{
        tenTruyen = o.getString("tenTruyen");
        tenChap = o.getString("tenChap");
        LinkAnh = o.getString("LinkAnh");
        body = o.getString("body");
    }

    public TruyenTranh(String tenTruyen, String tenChap, String linkAnh, String body) {
        this.tenTruyen = tenTruyen;
        this.tenChap = tenChap;
        LinkAnh = linkAnh;
        this.body = body;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public String getTenChap() {
        return tenChap;
    }

    public void setTenChap(String tenChap) {
        this.tenChap = tenChap;
    }

    public String getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        LinkAnh = linkAnh;
    }



    public TruyenTranh(String tenTruyen, String tenChap, String linkAnh) {
        this.tenTruyen = tenTruyen;
        this.tenChap = tenChap;
        LinkAnh = linkAnh;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

