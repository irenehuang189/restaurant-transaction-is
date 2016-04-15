package com.waroengsteakandshake.orderapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 15-Apr-16.
 */
public class TambahPesananFragment extends Fragment {

    public TambahPesananFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tambah_pesanan, container, false);

        // Inflate the layout for this fragment
        return view;
    }
}
