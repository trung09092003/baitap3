package com.example.thdidong.ui.dathang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thdidong.R;


public class OrderFragmentTab2 extends Fragment {
    View view;
    RecyclerView gridView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_listtab1, container, false);
        gridView = view.findViewById(R.id.list);

        return view;

    }
}