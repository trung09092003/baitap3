package com.example.thdidong.ui.dathang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thdidong.R;


public class OrderFragmentTab3 extends Fragment {
    View view05;
    RecyclerView gridView05;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view05= inflater.inflate(R.layout.fragment_listtab1, container, false);
        gridView05 = view05.findViewById(R.id.list);

        return view05;
    }
}