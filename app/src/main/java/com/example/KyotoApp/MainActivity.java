package com.example.KyotoApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.KyotoApp.InfoApp.InfoActivity;
import com.example.KyotoApp.recyclecari.ListKonten;
import com.google.android.material.button.MaterialButton;
import com.makeramen.roundedimageview.RoundedImageView;


public class MainActivity extends AppCompatActivity {

    private MaterialButton btnCariBeranda;
    private RoundedImageView btnKategori1, btnKategori2, btnKategori3, btnKategori4, TentangApp, TentangKyoto, ShrinedanTample, TentangPrefektur;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TentangApp = findViewById(R.id.idTentangApp);
        TentangApp.setOnClickListener(btnInfoClicked);

        TentangKyoto = findViewById(R.id.idTentangKyoto);
        TentangKyoto.setOnClickListener(btnTentangKyoto);

        ShrinedanTample = findViewById(R.id.idShrinedanTample);
        ShrinedanTample.setOnClickListener(btnShrinedanTample);

        TentangPrefektur = findViewById(R.id.idTentangPrefektur);
        TentangPrefektur.setOnClickListener(btnTentangPrefektur);

        btnCariBeranda = findViewById(R.id.btnCari_Beranda);
        btnCariBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListKonten.class);
                startActivity(intent);
            }
        });

        btnKategori1 = findViewById(R.id.kategoriBeranda1);
        btnKategori1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriKonten.class);
                intent.putExtra("kategori", "Wisata");
                startActivity(intent);
            }
        });

        btnKategori2 = findViewById(R.id.kategoriBeranda2);
        btnKategori2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriKonten.class);
                intent.putExtra("kategori", "Kuil");
                startActivity(intent);
            }
        });
        btnKategori3 = findViewById(R.id.kategoriBeranda3);
        btnKategori3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriKonten.class);
                intent.putExtra("kategori", "Makanan");
                startActivity(intent);
            }
        });
        btnKategori4 = findViewById(R.id.kategoriBeranda4);
        btnKategori4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriKonten.class);
                intent.putExtra("kategori", "Festival");
                startActivity(intent);
            }
        });

    }

    View.OnClickListener btnInfoClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btnTentangKyoto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TentangKyoto.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btnShrinedanTample = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ShrinedanTample.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btnTentangPrefektur = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TentangPrefektur.class);
            startActivity(intent);
        }
    };

}