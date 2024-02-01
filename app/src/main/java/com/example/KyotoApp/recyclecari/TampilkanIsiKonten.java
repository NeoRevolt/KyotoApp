package com.example.KyotoApp.recyclecari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;

import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.KyotoApp.model.ItemModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.example.KyotoApp.R;

public class TampilkanIsiKonten extends AppCompatActivity implements OnMapReadyCallback {

    private ImageView gambar;
    private TextView judul, deskripsi, lokasi, akses, waktu, fee, daerah, tautan, kor;
    GoogleMap googleMaps;
    ItemModel itemModel;
    String Skor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan_isi_konten);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" ");

        //show maps
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync( this);

        gambar = findViewById(R.id.idTampilGambar);
        judul = findViewById(R.id.idJudulTampil);
        deskripsi = findViewById(R.id.idDeskripsiTampil);
        lokasi = findViewById(R.id.idisilok);
        akses = findViewById(R.id.idisiaks);
        waktu = findViewById(R.id.idisiwak);
        fee = findViewById(R.id.idisifee);
        daerah = findViewById(R.id.idisidae);
        tautan = findViewById(R.id.idisilink);
        kor = findViewById((R.id.idisikor));

        tautan.setMovementMethod(LinkMovementMethod.getInstance());

        int idGambar = getIntent().getIntExtra("id_gambar",R.drawable.tips1);
        String idJudul = getIntent().getStringExtra("id_judul");
        int idDesk = getIntent().getIntExtra("id_desk",R.string.deks_default);
        int idLok = getIntent().getIntExtra("id_lok",R.string.deks_default);
        int idAks = getIntent().getIntExtra("id_aks",R.string.deks_default);
        int idWak = getIntent().getIntExtra("id_wak",R.string.deks_default);
        int idFee = getIntent().getIntExtra("id_fee",R.string.deks_default);
        int idDae = getIntent().getIntExtra("id_dae",R.string.deks_default);
        int idLink = getIntent().getIntExtra("id_link",R.string.deks_default);
        int idKor = getIntent().getIntExtra("id_kor",R.string.deks_default);

        gambar.setImageResource(idGambar);
        judul.setText(idJudul);
        deskripsi.setText(idDesk);
        lokasi.setText(idLok);
        akses.setText(idAks);
        waktu.setText(idWak);
        fee.setText(idFee);
        daerah.setText(idDae);
        tautan.setText(idLink);
        kor.setText(idKor);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        //get LatLong
//        Skor1 = String.valueOf(kor);
//        String[] latlong = Skor1.split(",");
//        double latitude = Double.parseDouble(latlong[0]);
//        double longtitude = Double.parseDouble(latlong[1]);

        googleMaps = googleMap;
        LatLng latLng = new LatLng(66.656, 12.22);
        googleMaps.addMarker(new MarkerOptions().position(latLng).title(String.valueOf(judul)));
        googleMaps.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMaps.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16));
        googleMaps.getUiSettings().setAllGesturesEnabled(true);
        googleMaps.getUiSettings().setZoomGesturesEnabled(true);
        googleMaps.setTrafficEnabled(true);

    }
}