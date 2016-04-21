package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 15-Apr-16.
 */
public class PesananAcitivity extends AppCompatActivity {

    private TextView nomor_meja;
    private TextView jumlah_pesanan_cordon;
    private TextView jumlah_pesanan_double;
    private TextView jumlah_pesanan_drumstick;
    private TextView jumlah_pesanan_beef;
    private TextView jumlah_pesanan_strawberry;
    private TextView jumlah_pesanan_coklat;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.acitivity_pesanan);

        nomor_meja = (TextView) findViewById(R.id.pesanan_meja);
        jumlah_pesanan_cordon = (TextView) findViewById(R.id.jumlah_pesanan_cordon);
        jumlah_pesanan_double = (TextView) findViewById(R.id.jumlah_pesanan_double);
        jumlah_pesanan_drumstick = (TextView) findViewById(R.id.jumlah_pesanan_drumstick);
        jumlah_pesanan_beef = (TextView) findViewById(R.id.jumlah_pesanan_beef);
        jumlah_pesanan_strawberry = (TextView) findViewById(R.id.jumlah_pesanan_strawberry);
        jumlah_pesanan_coklat = (TextView) findViewById(R.id.jumlah_pesanan_coklat);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        setUpView(bundle);
    }

    private void setUpView(Bundle bundle) {
        String meja = bundle.getString("nomor_meja");
        nomor_meja.setText(meja);

        String jpc = bundle.getString("jumlah_chicken_cordon_bleu");
        if (jpc.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_cordon)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_cordon.setText(jpc);
        }

        String jpd = bundle.getString("jumlah_chicken_cordon_double");
        if (jpd.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_double)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_double.setText(jpd);
        }

        String jpds = bundle.getString("jumlah_chicken_drumstick");
        if (jpds.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_drumstick)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_drumstick.setText(jpds);
        }

        String jpb = bundle.getString("jumlah_beef_steak");
        if (jpb.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_beef)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_beef.setText(jpb);
        }

        String jps = bundle.getString("jumlah_milkshake_strawberry");
        if (jps.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_strawberry)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_strawberry.setText(jps);
        }

        String jpck = bundle.getString("jumlah_milkshake_coklat");
        if (jpck.equals("0")) {
            ((LinearLayout) findViewById(R.id.pesanan_coklat)).setVisibility(View.GONE);
        }
        else {
            jumlah_pesanan_coklat.setText(jpck);
        }
    }
}
