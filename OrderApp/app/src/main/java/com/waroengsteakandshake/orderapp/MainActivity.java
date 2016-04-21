package com.waroengsteakandshake.orderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private int nomor_meja;
    private int cordon_bleu;
    private int chicken_double;
    private int chicken_drumstick;
    private int beef_steak;
    private int milkshake_strawberry;
    private int milkshake_coklat;

    private DaftarPesananFragment daftarPesananFragment;
    private List<String> list_meja;

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

        List<String> list_meja = new ArrayList<>();
        daftarPesananFragment = DaftarPesananFragment.newInstance(list_meja);

        // Default menu selected
        if (navigationView != null) {
            navigationView.getMenu().getItem(0).setChecked(true);
            onNavigationItemSelected(navigationView.getMenu().getItem(0));
        }

        nomor_meja = 1;
        cordon_bleu = 0;
        chicken_double = 0;
        chicken_drumstick = 0;
        beef_steak = 0;
        milkshake_coklat = 0;
        milkshake_strawberry = 0;
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

        FragmentManager fragmentManager = getSupportFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_daftar_pesanan) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, daftarPesananFragment)
                    .commit();
        }
        else if (id == R.id.nav_tambah_pesanan) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, new TambahPesananFragment())
                    .commit();

        }
        else if (id == R.id.nav_daftar_menu) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, new DaftarMenuWSFragment())
                    .commit();
        }
        else if (id == R.id.nav_keluar) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    public void onTambah(View view) {
        try {
            String nomor_meja = ((EditText) findViewById(R.id.nomor_meja)).getText().toString();
            String jumlah_chicken_cordon_bleu =
                    ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).getText().toString();
            String jumlah_chicken_double =
                    ((EditText) findViewById(R.id.jumlah_chicken_double)).getText().toString();
            String jumlah_chicken_drumstick =
                    ((EditText) findViewById(R.id.jumlah_chicken_drumstick)).getText().toString();
            String jumlah_beef_steak =
                    ((EditText) findViewById(R.id.jumlah_beef_steak)).getText().toString();
            String jumlah_milkshake_strawberry =
                    ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).getText().toString();
            String jumlah_milkshake_coklat =
                    ((EditText) findViewById(R.id.jumlah_milkshake_coklat)).getText().toString();

            String[] pesanan = {
                    jumlah_chicken_cordon_bleu,
                    jumlah_chicken_double,
                    jumlah_chicken_drumstick,
                    jumlah_beef_steak,
                    jumlah_milkshake_strawberry,
                    jumlah_milkshake_coklat
            };
            daftarPesananFragment.addItem("Meja " + nomor_meja, pesanan);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, daftarPesananFragment)
                    .commit();
        }
        catch (Exception ignored) {}
    }

    public void add1(View view) {
        String jumlah_chicken_cordon_bleu =
                ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).getText().toString();
        if (jumlah_chicken_cordon_bleu != null){
            cordon_bleu = Integer.parseInt(jumlah_chicken_cordon_bleu);
        }

        cordon_bleu++;
        ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).setText(Integer.toString(cordon_bleu));
    }

    public void minus1(View view) {
        String jumlah_chicken_cordon_bleu =
                ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).getText().toString();
        if (jumlah_chicken_cordon_bleu != null)
            cordon_bleu = Integer.parseInt(jumlah_chicken_cordon_bleu);

        if (cordon_bleu > 0) {
            cordon_bleu--;
        }
        else {
            cordon_bleu = 0;
        }

        ((EditText) findViewById(R.id.jumlah_chicken_cordon_bleu)).setText(Integer.toString(cordon_bleu));
    }

    public void add2(View view) {
        String jumlah_chicken_double =
                ((EditText) findViewById(R.id.jumlah_chicken_double)).getText().toString();
        if (jumlah_chicken_double != null){
            chicken_double = Integer.parseInt(jumlah_chicken_double);
        }

        chicken_double++;
        ((EditText) findViewById(R.id.jumlah_chicken_double)).setText(Integer.toString(chicken_double));
    }

    public void minus2(View view) {
        String jumlah_chicken_double =
                ((EditText) findViewById(R.id.jumlah_chicken_double)).getText().toString();
        if (jumlah_chicken_double != null)
            chicken_double = Integer.parseInt(jumlah_chicken_double);

        if (chicken_double > 0) {
            chicken_double--;
        }
        else {
            chicken_double = 0;
        }

        ((EditText) findViewById(R.id.jumlah_chicken_double)).setText(Integer.toString(chicken_double));
    }

    public void add3(View view) {
        String jumlah_chicken_drumstick =
                ((EditText) findViewById(R.id.jumlah_chicken_drumstick)).getText().toString();
        if (jumlah_chicken_drumstick != null){
            chicken_drumstick = Integer.parseInt(jumlah_chicken_drumstick);
        }

        chicken_drumstick++;
        ((EditText) findViewById(R.id.jumlah_chicken_drumstick)).setText(Integer.toString(chicken_drumstick));
    }

    public void minus3(View view) {
        String jumlah_chicken_drumstick =
                ((EditText) findViewById(R.id.jumlah_chicken_drumstick)).getText().toString();
        if (jumlah_chicken_drumstick != null)
            chicken_drumstick = Integer.parseInt(jumlah_chicken_drumstick);

        if (chicken_drumstick > 0) {
            chicken_drumstick--;
        }
        else {
            chicken_drumstick = 0;
        }

        ((EditText) findViewById(R.id.jumlah_chicken_drumstick)).setText(Integer.toString(chicken_drumstick));
    }

    public void add4(View view) {
        String jumlah_beef_steak =
                ((EditText) findViewById(R.id.jumlah_beef_steak)).getText().toString();
        if (jumlah_beef_steak != null){
            beef_steak= Integer.parseInt(jumlah_beef_steak);
        }

        beef_steak++;
        ((EditText) findViewById(R.id.jumlah_beef_steak)).setText(Integer.toString(beef_steak));
    }

    public void minus4(View view) {
        String jumlah_beef_steak =
                ((EditText) findViewById(R.id.jumlah_beef_steak)).getText().toString();
        if (jumlah_beef_steak != null)
            beef_steak = Integer.parseInt(jumlah_beef_steak);

        if (beef_steak > 0) {
            beef_steak--;
        }
        else {
            beef_steak = 0;
        }

        ((EditText) findViewById(R.id.jumlah_beef_steak)).setText(Integer.toString(beef_steak));
    }

    public void add5(View view) {
        String jumlah_milkshake_staweberry =
                ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).getText().toString();
        if (jumlah_milkshake_staweberry != null){
            milkshake_strawberry = Integer.parseInt(jumlah_milkshake_staweberry);
        }

        milkshake_strawberry++;
        ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).setText(Integer.toString(milkshake_strawberry));
    }

    public void minus5(View view) {
        String jumlah_milkshake_strawberry =
                ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).getText().toString();
        if (jumlah_milkshake_strawberry != null)
            milkshake_strawberry = Integer.parseInt(jumlah_milkshake_strawberry);

        if (milkshake_strawberry > 0) {
            milkshake_strawberry--;
        }
        else {
            milkshake_strawberry = 0;
        }

        ((EditText) findViewById(R.id.jumlah_milkshake_strawberry)).setText(Integer.toString(milkshake_strawberry));
    }

    public void add6(View view) {
        String jumlah_milkshake_coklat =
                ((EditText) findViewById(R.id.jumlah_milkshake_coklat)).getText().toString();
        if (jumlah_milkshake_coklat!= null){
            milkshake_coklat = Integer.parseInt(jumlah_milkshake_coklat);
        }

        milkshake_coklat++;
        ((EditText) findViewById(R.id.jumlah_milkshake_coklat)).setText(Integer.toString(milkshake_coklat));
    }

    public void minus6(View view) {
        String jumlah_milkshake_coklat =
                ((EditText) findViewById(R.id.jumlah_milkshake_coklat)).getText().toString();
        if (jumlah_milkshake_coklat != null)
            milkshake_coklat = Integer.parseInt(jumlah_milkshake_coklat);

        if (milkshake_coklat > 0) {
            milkshake_coklat--;
        }
        else {
            milkshake_coklat= 0;
        }

        ((EditText) findViewById(R.id.jumlah_milkshake_coklat)).setText(Integer.toString(milkshake_coklat));
    }
}
