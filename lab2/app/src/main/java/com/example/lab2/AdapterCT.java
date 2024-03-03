package com.example.lab2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterCT extends BaseAdapter {
       private ArrayList<Contact> data;

       private Activity context;
       private LayoutInflater inflater;

    public AdapterCT(ArrayList<Contact> listCT, MainActivity mainActivity) {
        this.data = listCT;
        this.context = mainActivity;
        this.inflater = LayoutInflater.from(mainActivity);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        String packageName = context.getPackageName();
        if(v == null ){
            v = inflater.inflate(R.layout.list_item_layout, null);
        }

        TextView tvName = v.findViewById(R.id.textViewName);
        tvName.setText(data.get(position).getName());
        TextView tvPhone = v.findViewById(R.id.textViewNumber);
        tvPhone.setText(data.get(position).getPhoneNumber());
        CheckBox checkBox = v.findViewById(R.id.check_status);
        checkBox.setChecked(data.get(position).getStatus());

        return v;
    }
}
