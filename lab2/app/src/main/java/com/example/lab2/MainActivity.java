package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> listCT;
    private EditText HoTen;
    private Button btn_them;
    private  Button btn_remove;
    private AdapterCT adapterCT;
    private ListView listDS;
    private CheckBox CB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }
    private  boolean checkText(){
        if(HoTen.getText().toString().equals("")){
            return false;
        }
        return true;
    }
    private void addEvent() {
        btn_them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(checkText()){
                        Contact contact = new Contact(HoTen.getText().toString(), "04182" , false);
                        listCT.add(contact);
                        adapterCT.notifyDataSetChanged();
                        HoTen.setText("");
                    }



            }
        });
        HoTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HoTen.setText("");
                HoTen.findFocus();
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = listCT.size() - 1; i >= 0; i--) {
                    Contact contact = listCT.get(i);
                    if (contact.getStatus()) { // Nếu status là true
                        listCT.remove(i); // Xoá đối tượng tại vị trí i
                    }
                }
                adapterCT.notifyDataSetChanged();
            }
        });
    }

    private void addControls() {
        HoTen = findViewById(R.id.edt_Name);
        btn_them = findViewById(R.id.btn_add);
        btn_remove = findViewById(R.id.btn_delete);
        listDS = findViewById(R.id.list_id);
        CB1 = findViewById(R.id.check_status);

        listCT = new ArrayList<Contact>();
        listCT.add(new Contact("Leo" , "048232", true));

        adapterCT = new AdapterCT(listCT , this);
        listDS.setAdapter(adapterCT);


    }

}