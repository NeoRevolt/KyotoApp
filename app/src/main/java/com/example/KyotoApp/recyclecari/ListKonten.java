package com.example.KyotoApp.recyclecari;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.KyotoApp.DaftarSeluruhKonten;
import com.example.KyotoApp.R;
import com.example.KyotoApp.model.ItemModel;

import java.util.List;

public class ListKonten extends AppCompatActivity {

    private AdapterKonten adapterKonten;
    private List<ItemModel> list;
    private LinearLayoutManager linearLayoutManager;
    private boolean isFiltered = false;
    private RecyclerView recyclerView;
    String TAG = "ListKontenActivity";
    private DaftarSeluruhKonten daftarseluruhkonten;
    TextView textGagal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_konten);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cari Konten");
        final MediaPlayer suaraSplashScreen = MediaPlayer.create(this, R.raw.confirmsfxsatu);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        daftarseluruhkonten = new DaftarSeluruhKonten();
        list = daftarseluruhkonten.listData();

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.idRecycle1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapterKonten = new AdapterKonten(list, listener);
        recyclerView.setAdapter(adapterKonten);
        textGagal = findViewById(R.id.idTextGagal);


        final SearchView searchView = (SearchView) findViewById(R.id.idCari2);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d(TAG, "onQueryTextChange: newtext " + newText);
                isFiltered = searchView.getQuery().length() > 0;
                adapterKonten.getFilter().filter(newText);


                Log.d(TAG, "onCreate: List size didalem filter " + adapterKonten.getList().size());
                textGagal.setText("");
                if (adapterKonten.getList().size() < 1) {
                    Toast.makeText(ListKonten.this, "Konten tidak ditemukan", Toast.LENGTH_SHORT).show();
                    textGagal.setText("Konten belum tersedia");
                    suaraSplashScreen.start();
                }
                if (newText.equals("") || newText == null) {
                    textGagal.setText("");
                }
                return true;
            }
        });
    }

    private AdapterKonten.OnItemClickListener listener = new AdapterKonten.OnItemClickListener() {
        @Override
        public void onItemClicked(ItemModel itemModel) {
            Intent intent = new Intent(ListKonten.this, TampilkanIsiKonten.class);
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