package com.example.test_thi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    adapter_recycleview adapter;
    List<contact> list;
    RecyclerView recyclerView;
    Button btn;

    MyDB myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_add);
        recyclerView = findViewById(R.id.list_contact);


//        list = new ArrayList<contact>();
//        list.add(new contact(1, "khanh", "08312832"));

//        adapter = new adapter_recycleview(list, this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Add_sv.class);
                startActivityForResult(intent, 100);
            }
        });

        initializeData();
//        sapXepTang();

    }

    private void initializeData() {
        myDB = new MyDB(this, "ContactDB", null, 1);
//        myDB.addContact(new contact(1, "Khanh1", "09412482148"));
//        myDB.addContact(new contact(2, "Khanh2", "09412482148"));
//        myDB.addContact(new contact(3, "Khanh3", "09412482148"));

        list = myDB.getAllContacts();
        adapter = new adapter_recycleview(list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
    private void sapXepTang(){
        Collections.sort(list, new Comparator<contact>() {
            @Override
            public int compare(contact o1, contact o2) {

                return  o1.getName().compareTo(o2.getName());
            }
        });
        adapter.notifyDataSetChanged();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle b = data.getExtras();
        int id = b.getInt("Id");
        String name = b.getString("Name");
        String phone = b.getString("Phone");
        Toast.makeText(this, id + " " + phone + " " + name , Toast.LENGTH_SHORT).show();
        contact newContact = new contact(id, name, phone);
        if (requestCode == 100 && resultCode == 150) {
           if (data!=null){
               list.add(newContact);
               myDB.addContact(newContact);
               adapter.notifyDataSetChanged();
           }
        }
    }
}