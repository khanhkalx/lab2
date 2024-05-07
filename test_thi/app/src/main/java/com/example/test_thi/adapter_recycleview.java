package com.example.test_thi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_recycleview extends RecyclerView.Adapter<adapter_recycleview.ViewHolder> {

    private List<contact> list;
    Context context;

    public adapter_recycleview(List<contact> list , Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_recycleview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycle, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_recycleview.ViewHolder holder, int position) {
          int id = list.get(position).getId();
          holder.txt1.setText(id+"");
          String name = list.get(position).getName();
          holder.txt2.setText(name);
          String phone = list.get(position).getPhone();
          holder.txt3.setText(phone);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{

        TextView txt1;
        TextView txt2;
        TextView txt3;
        public ViewHolder(View itemView){
            super(itemView);
            txt1 = itemView.findViewById(R.id.textView4);
            txt2 = itemView.findViewById(R.id.textView5);
            txt3 = itemView.findViewById(R.id.textView6);
        }
    }
}
