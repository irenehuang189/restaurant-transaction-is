package com.waroengsteakandshake.orderapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 15-Apr-16.
 */
public class DaftarMenuWSFragment extends Fragment {

    private boolean[] status;

    public static DaftarMenuWSFragment newInstance(boolean[] status) {
        DaftarMenuWSFragment fragment = new DaftarMenuWSFragment();

        fragment.status = status;

        return fragment;
    }

    public DaftarMenuWSFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daftar_menu, container, false);

        TextView status_cb = (TextView) view.findViewById(R.id.status_cordon_bleu);
        TextView status_cd = (TextView) view.findViewById(R.id.status_chicken_double);
        TextView status_ds = (TextView) view.findViewById(R.id.status_drumstick);
        TextView status_bs = (TextView) view.findViewById(R.id.status_beef_steak);
        TextView status_ck = (TextView) view.findViewById(R.id.status_coklat);
        TextView status_st = (TextView) view.findViewById(R.id.status_strawberry);

        if (status[0]) {
            status_cb.setText("Tersedia");
            status_cb.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_cb.setText("Tidak Tersedia");
            status_cb.setTextColor(Color.RED);
        }

        if (status[1]) {
            status_cd.setText("Tersedia");
            status_cd.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_cd.setText("Tidak Tersedia");
            status_cd.setTextColor(Color.RED);
        }

        if (status[2]) {
            status_ds.setText("Tersedia");
            status_ds.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_ds.setText("Tidak Tersedia");
            status_ds.setTextColor(Color.RED);
        }

        if (status[3]) {
            status_bs.setText("Tersedia");
            status_bs.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_bs.setText("Tidak Tersedia");
            status_bs.setTextColor(Color.RED);
        }

        if (status[4]) {
            status_ck.setText("Tersedia");
            status_ck.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_ck.setText("Tidak Tersedia");
            status_ck.setTextColor(Color.RED);
        }

        if (status[5]) {
            status_st.setText("Tersedia");
            status_st.setTextColor(getResources().getColor(R.color.colorAccent));
        }
        else {
            status_st.setText("Tidak Tersedia");
            status_st.setTextColor(Color.RED);
        }

        // Inflate the layout for this fragment
        return view;
    }

}