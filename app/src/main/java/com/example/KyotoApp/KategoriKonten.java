package com.example.KyotoApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.appcompat.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import com.example.KyotoApp.model.ItemModel;
import com.example.KyotoApp.recyclecari.TampilkanIsiKonten;
import com.example.KyotoApp.recyclekategori.AdapterKategori;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class KategoriKonten extends AppCompatActivity {
    ActionBar actionBar;

    private RoundedImageView gambarKategoriStatic1;
    private List<ItemModel> list;
    private DaftarSeluruhKonten daftarSeluruhKonten;
    private AdapterKategori adapterKategori;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;
    String TAG = "KategoriKonten";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_konten);
        daftarSeluruhKonten = new DaftarSeluruhKonten();
        gambarKategoriStatic1 = findViewById(R.id.idGambarKategoriStatic);
        setTitle(" ");

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //TODO
        String kategori = getIntent().getStringExtra("kategori");
        if (kategori.equalsIgnoreCase("Wisata")) {
            gambarKategoriStatic1.setImageResource(R.drawable.mwisata);
            list = daftarSeluruhKonten.listDataWisata();
        } else if (kategori.equalsIgnoreCase("Kuil")) {
            gambarKategoriStatic1.setImageResource(R.drawable.mkuil);
            list = daftarSeluruhKonten.listDataKuil();
        } else if (kategori.equalsIgnoreCase("Makanan")) {
            gambarKategoriStatic1.setImageResource(R.drawable.mfood);
            list = daftarSeluruhKonten.listDataMakanan();
        } else if (kategori.equalsIgnoreCase("Festival")) {
            gambarKategoriStatic1.setImageResource(R.drawable.mfestival);
            list = daftarSeluruhKonten.listDataFestival();
        }

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.idRecycleKategori);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapterKategori = new AdapterKategori(list, listener);
        recyclerView.setAdapter(adapterKategori);

    }

    private AdapterKategori.OnItemClickListener listener = new AdapterKategori.OnItemClickListener() {
        @Override
        public void onItemClicked(ItemModel itemModel) {
            Intent intent = new Intent(KategoriKonten.this, TampilkanIsiKonten.class);
            intent.putExtra("id_gambar", itemModel.getIdListGambar());
            intent.putExtra("id_judul", itemModel.getIdListNama());
            intent.putExtra("id_desk", itemModel.getIdListDeskripsi());
            intent.putExtra("id_lok", itemModel.getIdListlok());
            intent.putExtra("id_aks", itemModel.getIdListaks());
            intent.putExtra("id_wak", itemModel.getIdListwak());
            intent.putExtra("id_fee", itemModel.getIdListfee());
            intent.putExtra("id_dae", itemModel.getIdListdae());
            intent.putExtra("id_link", itemModel.getIdListlink());
            intent.putExtra("id_kor", itemModel.getIdListkor());
            startActivity(intent);

        }
    };
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}