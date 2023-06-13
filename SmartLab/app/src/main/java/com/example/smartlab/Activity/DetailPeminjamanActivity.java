package com.example.smartlab.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.smartlab.R;

public class DetailPeminjamanActivity extends AppCompatActivity {

    // mendeklarasikan variabel-variabel
    TextView ttl_pilihBarang, txt_hari, txt_totalItems, edt_outTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_peminjaman);

        // inisialisasi atau penghubungan antara objek TextView dan EditText dengan elemen-elemen yang sesuai dalam tampilan XML.
        ttl_pilihBarang = findViewById(R.id.ttl_pilihBarang);
        txt_hari = findViewById(R.id.txt_hari);
        txt_totalItems = findViewById(R.id.txt_totalItems);
        edt_outTanggal = findViewById(R.id.edt_outTanggal);

        // untuk mengambil nilai-nilai yang dikirim melalui Intent dari aktivitas sebelumnya menggunakan Bundle, dan kemudian mengatur nilai-nilai tersebut ke objek TextView dan EditText yang sesuai.
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            ttl_pilihBarang.setText(bundle.getString("Peminjaman"));
            txt_hari.setText(bundle.getString("Hari"));
            txt_totalItems.setText(bundle.getString("Total"));
            edt_outTanggal.setText(bundle.getString("Tanggal"));
        }
    }
}