package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by User on 15-Apr-16.
 */
public class DaftarPesananFragment extends Fragment {

    private List<String> list_meja;
    private ListView listView;
    private Map<String, String[]> data;

    public static DaftarPesananFragment newInstance(List<String> list_meja) {
        DaftarPesananFragment fragment = new DaftarPesananFragment();

        fragment.list_meja = list_meja;
        fragment.data = new HashMap<>();

        return fragment;
    }

    public DaftarPesananFragment() {}

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daftar_pesanan, container, false);

        listView = (ListView) view.findViewById(R.id.listview);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                R.layout.daftar_pesanan_item, R.id.txtview, list_meja);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {

                final String item = (String) parent.getItemAtPosition(position);
                String[] pesanan = data.get(item);

                Intent intent = new Intent(getActivity(), PesananAcitivity.class);
                intent.putExtra("nomor_meja", "" + item.charAt(5));
                intent.putExtra("jumlah_chicken_cordon_bleu", pesanan[0]);
                intent.putExtra("jumlah_chicken_cordon_double", pesanan[1]);
                intent.putExtra("jumlah_chicken_drumstick", pesanan[2]);
                intent.putExtra("jumlah_beef_steak", pesanan[3]);
                intent.putExtra("jumlah_milkshake_strawberry", pesanan[4]);
                intent.putExtra("jumlah_milkshake_coklat", pesanan[5]);
                startActivity(intent);
            }

        });

        // Inflate the layout for this fragment
        return view;
    }

    public void addItem(String meja, String[] pesanan) {
        list_meja.add(meja);
        data.put(meja, pesanan);
        ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
    }
}
