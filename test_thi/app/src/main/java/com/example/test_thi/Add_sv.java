package com.example.test_thi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Add_sv extends AppCompatActivity {

    Button btn_back;
    Button add;

    EditText editText1;
    EditText editText2;
    EditText editText3;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_sv);
        textView =  findViewById(R.id.header_txt);
        editText1 = findViewById(R.id.editTextText2);
        editText2 = findViewById(R.id.editTextText3);
        editText3 = findViewById(R.id.editTextText4);

        btn_back = findViewById(R.id.back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                finish();
            }
        });

        textView.setText("Nguyễn Hoàng Khánh");

        add = findViewById(R.id.add_sv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = editText1.getText().toString();
                int id1 = Integer.parseInt(id);
                String Name = editText2.getText().toString();
                String Phone = editText3.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                Bundle b = new Bundle();
                b.putInt("Id", id1);
                b.putString("Name", Name);
                b.putString("Phone", Phone);
                intent.putExtras(b);

                setResult(150 , intent);
                finish();
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK && data!=null){


        }
    }
}
