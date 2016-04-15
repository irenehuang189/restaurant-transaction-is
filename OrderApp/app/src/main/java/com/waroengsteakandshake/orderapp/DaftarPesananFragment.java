package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by User on 15-Apr-16.
 */
public class DaftarPesananFragment extends Fragment {

    public DaftarPesananFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daftar_pesanan, container, false);

        ListView listView = (ListView) view.findViewById(R.id.listview);

        String[] values = new String[] {
                "Meja 1", "Meja 2", "Meja 3",
                "Meja 4", "Meja 5", "Meja 6", "Meja 7", "Meja 8",
                "Meja 9", "Meja 10" };

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                R.layout.daftar_pesanan_item, R.id.txtview, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {

                final String item = (String) parent.getItemAtPosition(position);
                //do something

                startActivity(new Intent(getActivity(), PesananAcitivity.class));
            }

        });

        // Inflate the layout for this fragment
        return view;
    }
}
