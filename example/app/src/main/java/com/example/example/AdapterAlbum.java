package com.example.example;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import Model.Album;

public class AdapterAlbum extends BaseAdapter {
    private ArrayList<Album> data;
    private Activity context;
    private LayoutInflater inflater;

    public AdapterAlbum(ArrayList<Album> listAL, List_view_album list_view_album) {
        this.data = listAL;
        this.context =  list_view_album.getActivity();
        this.inflater = LayoutInflater.from(context);
    }

    public  void setData(ArrayList<Album> data){
        this.data = data;
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
        return Long.parseLong(data.get(position).getIdAlbum());
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        String packageName = context.getPackageName();
        if(v == null){
            v = inflater.inflate(R.layout.layout_album_view, null);
        }
        ImageView img_album = v.findViewById(R.id.img_album);
        String imagePath = data.get(position).getHinhAlbum();
        if(img_album != null){
            try{
                int imageId = Integer.parseInt(imagePath);
                img_album.setImageResource(imageId);
            }catch(NumberFormatException e){
                img_album.setImageURI(Uri.parse(imagePath));
            }
        }else {
            img_album.setImageResource(R.drawable.chipu);
        }

        TextView txt_Name_album = v.findViewById(R.id.name_album);
        txt_Name_album.setText(data.get(position).getTenAlbum());
        return v;
    }
}
