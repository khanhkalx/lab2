package com.example.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Search_music extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container , Bundle saveBundle) {
        return  inflater.inflate(R.layout.search_music, container , false);

    }

}
