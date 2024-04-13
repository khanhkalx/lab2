package com.example.project_btl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class BodyTruyen extends AppCompatActivity {

    private TextView tvTenTruyen;
    private TextView tvTenChap;
    private TextView tvBody;
    private ImageView imgAnhTruyen;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_truyen);
        tvTenTruyen = findViewById(R.id.tvTenTruyen);
        tvTenChap = findViewById(R.id.tvTenChap);
        tvBody = findViewById(R.id.tvBody);
        imgAnhTruyen = findViewById(R.id.imgTruyen);
        Intent intent = getIntent();
        if (intent != null) {
            String tenTruyen = intent.getStringExtra("tenTruyen");
            String tenChap = intent.getStringExtra("tenChap");
            String body = intent.getStringExtra("body");
            String linkAnh = intent.getStringExtra("linkAnh");

            // Hiển thị dữ liệu truyền lên TextViews và ImageView
            tvTenTruyen.setText(tenTruyen);
            tvTenChap.setText(tenChap);
            tvBody.setText(body);

            // Load ảnh từ URL sử dụng Glide
            Glide.with(this).load(linkAnh).into(imgAnhTruyen);
        }
        btn = findViewById(R.id.btnGoBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
