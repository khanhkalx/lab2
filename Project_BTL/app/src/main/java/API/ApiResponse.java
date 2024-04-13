package API;

import java.util.List;

import model.TruyenTranh;

public class ApiResponse {
    private List<TruyenTranh> data;
    private String id;
    private String displayName;
    private String version;

    public List<TruyenTranh> getData() {
        return data;
    }

    public void setData(List<TruyenTranh> data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
