package com.example.project_btl;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import model.TruyenTranh;

public class Adapter_Truyen extends ArrayAdapter<TruyenTranh> {

    private Context context;
    private ArrayList<TruyenTranh> list;
    public Adapter_Truyen(@NonNull Context context, int resource, @NonNull List<TruyenTranh> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = new ArrayList<>(objects);
    }

    public void sortTruyen(String s){
        s = s.toUpperCase();
        int k = 0;
        for (int i=0;i< list.size() ;i++){
              TruyenTranh truyenTranh = list.get(i);
              String ten = truyenTranh.getTenTruyen().toUpperCase();
              if(ten.indexOf(s) >=0){
                  list.set(i, list.get(k));
                  list.set(k,truyenTranh);
                  k++;
              }
        }
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_truyen, null);
        }
        if(list.size() > 0 ){
            TruyenTranh truyenTranh = this.list.get(position);
            TextView tenTenTruyen = convertView.findViewById(R.id.txvTenTruyen);
            TextView tenTenChap = convertView.findViewById(R.id.txvTenChap);
            ImageView imgAnhtruyen = convertView.findViewById(R.id.imgAnhTruyen);


            tenTenTruyen.setText(truyenTranh.getTenTruyen());
            tenTenChap.setText(truyenTranh.getTenChap());

            Glide.with(this.context).load(truyenTranh.getLinkAnh()).into(imgAnhtruyen);

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, BodyTruyen.class);
                    intent.putExtra("tenTruyen", truyenTranh.getTenTruyen());
                    intent.putExtra("tenChap", truyenTranh.getTenChap());
                    intent.putExtra("linkAnh", truyenTranh.getLinkAnh());
                    intent.putExtra("body", truyenTranh.getBody());
                    context.startActivity(intent);
                }
            });
        }
        return convertView;
    }
}
