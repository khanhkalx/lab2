package com.example.example;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Objects;

import Model.Album;

public class List_view_album extends Fragment {
    private ListView list ;
    private ArrayList<Album> albumArrayList;
    private AdapterAlbum adapterAlbum;



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view_album, container, false);
        list = view.findViewById(R.id.list_album);
        String img =String.valueOf(R.drawable.chipu);
        albumArrayList = new ArrayList<Album>();
        albumArrayList.add(new Album("Phổ Biến" , "Album Sky" , "Sơn Tùng" , img));
        albumArrayList.add(new Album("Phổ Biến" , "Album Sky" , "Sơn Tùng" , img));
        albumArrayList.add(new Album("Phổ Biến" , "Album Sky" , "Sơn Tùng" , img));
        albumArrayList.add(new Album("Phổ Biến" , "Album Sky" , "Sơn Tùng" , img));
        adapterAlbum = new AdapterAlbum(albumArrayList , this);
        list.setAdapter(adapterAlbum);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

    }
}
