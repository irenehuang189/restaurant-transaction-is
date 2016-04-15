package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DaftarPesananFragment fragmentDaftarPesanan;
    private TambahPesananFragment fragmentTambahPesanan;
    private DaftarMenuWSFragment fragmentDaftarMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        if (drawer != null) {
            drawer.setDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }

        // Default menu selected
        if (navigationView != null) {
            navigationView.getMenu().getItem(0).setChecked(true);
        }

        // Default fragment
        fragmentDaftarPesanan = new DaftarPesananFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragmentDaftarPesanan).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_about) {
            String toToast = "Irene Rahman Heri";
            Toast toast = Toast.makeText(getApplicationContext(), toToast, Toast.LENGTH_SHORT);
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_daftar_pesanan) {
            fragmentDaftarPesanan = new DaftarPesananFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragmentDaftarPesanan).commit();
        }
        else if (id == R.id.nav_tambah_pesanan) {
            fragmentTambahPesanan = new TambahPesananFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragmentTambahPesanan).commit();
        }
        else if (id == R.id.nav_daftar_menu) {
            fragmentDaftarMenu = new DaftarMenuWSFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragmentDaftarMenu).commit();
        }
        else if (id == R.id.nav_keluar) {
            //Logout
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    public void onTambah(View view) {
        String nomor_meja = ((EditText) findViewById(R.id.nomor_meja)).getText().toString();
        String jumlah_chicken_cordon_bleu =
                ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).getText().toString();
        String jumlah_chicken_double=
                ((EditText) findViewById(R.id.jumlah_chicken_double)).getText().toString();
        String jumlah_steak_waroeng =
                ((EditText) findViewById(R.id.jumlah_steak_waroeng)).getText().toString();
        String jumlah_milkshake_strawberry =
                ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).getText().toString();
        String jumlah_avocado_juice =
                ((EditText) findViewById(R.id.jumlah_avocado_juice)).getText().toString();
        String jumlah_teh_panas =
                ((EditText) findViewById(R.id.jumlah_teh_panas)).getText().toString();

        /*
        intent.putExtra("jumlah_chicken_cordon_bleu", jumlah_chicken_cordon_bleu);
        intent.putExtra("jumlah_chicken_double", jumlah_chicken_double);
        intent.putExtra("jumlah_steak_waroeng", jumlah_steak_waroeng);
        intent.putExtra("jumlah_milkshake_strawberry", jumlah_milkshake_strawberry);
        intent.putExtra("jumlah_avocado_juice", jumlah_avocado_juice);
        intent.putExtra("jumlah_teh_panas", jumlah_teh_panas);
        */

        fragmentDaftarPesanan = new DaftarPesananFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragmentDaftarPesanan).commit();
    }
}
