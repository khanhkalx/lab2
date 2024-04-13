package com.example.project_btl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import API.ApiLayTruyen;
import API.ApiResponse;
import interfaces.LayTruyenVe;
import model.TruyenTranh;

public class MainActivity extends AppCompatActivity implements LayTruyenVe {
    GridView gridView;
    Adapter_Truyen adapterTruyen;
    List<TruyenTranh> list = new ArrayList<>();
    EditText edtSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ApiLayTruyen(this).execute();
        init();
        anhXa();
        setUp();
        setClick();
    }

    private void setClick() {
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                    String t = edtSearch.getText().toString();
                    adapterTruyen.sortTruyen(t);
            }
        });
    }

    private void setUp() {
        gridView.setAdapter(adapterTruyen);
    }

    private void anhXa() {
        gridView = findViewById(R.id.gdvDSTruyen);
        edtSearch = findViewById(R.id.edtTimKiem);
    }

    private void init(){
//        list = new ArrayList<TruyenTranh>();
//        list.add(new TruyenTranh("Tâm Linh Thú", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/tong-tai-ty-phu-chi-sung-co-vo-the-than_1701918805.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//        list.add(new TruyenTranh("Mỹ Nhân Ngư", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/yeu-than-ky_1443013926.jpg?gt=hdfgdfg&mobile=2","Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh"));
//        list.add(new TruyenTranh("Gà và Thỏ", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/dau-la-dai-luc_1552267757.jpg?gt=hdfgdfg&mobile=2","Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh"));
//        list.add(new TruyenTranh("Truyền Võ", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/truyen-vo_1542812509.jpg?gt=hdfgdfg&mobile=2","Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh"));
//        list.add(new TruyenTranh("Võ Luyện Đỉnh Phong", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/vo-luyen-dinh-phong_1514903369.jpg?gt=hdfgdfg&mobile=2","Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh"));
//        list.add(new TruyenTranh("Bách Luyện", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/bach-luyen-thanh-than_1444715692.jpg?gt=hdfgdfg&mobile=2","Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh"));
//
//        //
//        list.add(new TruyenTranh("Tinh Võ Thần Quyết", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/tinh-vo-than-quyet_1468459143.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//
//        list.add(new TruyenTranh("Lí do kết hôn", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/ly-do-ket-hon_1710987286.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//        list.add(new TruyenTranh("Hôm nay làm người", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/tu-hom-nay-bat-dau-lam-thanh-chu_1573815973.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//
//        list.add(new TruyenTranh("Girl Sicence", "Chapter4.2","https://i.truyenvua.com/ebook/190x247/girl-and-science_1479101189.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//        list.add(new TruyenTranh("Nguyên Tôn", "Chapter 5.3","https://i.truyenvua.com/ebook/190x247/nguyen-ton_1513349962.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));
//
//        list.add(new TruyenTranh("Tuyệt Thế Võ Thần", "Chapter 5.3","https://i.truyenvua.com/ebook/190x247/tuyet-the-vo-than_1479101756.jpg?gt=hdfgdfg&mobile=2", "Manga là loại truyện tranh và tranh biếm họa đến từ Nhật Bản. Manga có nhiều thể loại khác nhau, phù hợp với nhiều độ tuổi và giới tính khác nhau. Chúng thường được vẽ bằng màu đen trắng, nhưng cũng có manga màu. Bạn có thể tìm đọc manga trên các tạp chí hoặc những cuốn sách được xuất bản. \n" +
//                "\n" +
//                "Trong tiếng Nhật, manga được viết theo thể kanji là 漫画, âm Hán Việt là mạn họa, tạm dịch nghĩa là “hình ảnh di động hay biến động”. Ở Nhật, người ta dùng từ Nihon no manga – 日本の漫画 để chỉ những bộ truyện xuất phát từ xứ sở hoa anh đào và dùng từ Manga-ka 漫画家 để chỉ những người chuyên vẽ manga.\n" +
//                "\n" +
//                "Còn manga anime là gì? Anime là thể loại hoạt hình được chuyển thể từ manga. Anime thường có âm thanh và hình ảnh động, trong khi manga chỉ có hình ảnh tĩnh."));



        adapterTruyen = new Adapter_Truyen(this , 0 , list);

    }

    @Override
    public void batdau() {
        Toast.makeText(this, "Dang Lay Ve", Toast.LENGTH_SHORT).show();
    }

//    @Override
//    public void ketthuc(String data) {
//        try {
//            list.clear();
//            JSONArray array = new JSONArray(data);
//            for (int i = 0; i < array.length(); i++) {
//                JSONObject o = array.getJSONObject(i);
//                list.add(new TruyenTranh(o.getString("tenTruyen"), o.getString("tenChap"), o.getString("linkAnh"), o.getString("body")));
//            }
//
//            adapterTruyen.notifyDataSetChanged();
//        } catch (Exception e) {
//            Log.e("JSONError", "Error parsing JSON: " + e.getMessage());
//        }
//    }
@Override
public void ketthuc(ApiResponse data) {
    try {
        list.clear();
        list = data.getData();
        adapterTruyen = new Adapter_Truyen(this , 0 , list);
        gridView.setAdapter(adapterTruyen);
//        adapterTruyen.notifyDataSetChanged();

    } catch (Exception e) {
        Log.e("JSONError", "Error parsing JSON: " + e.getMessage());
    }
}

    @Override
    public void biLoi() {
        Toast.makeText(this, "Lỗi", Toast.LENGTH_SHORT).show();
    }
}