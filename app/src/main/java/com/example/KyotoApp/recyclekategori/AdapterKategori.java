package com.example.KyotoApp.recyclekategori;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.KyotoApp.R;
import com.example.KyotoApp.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class AdapterKategori extends RecyclerView.Adapter<AdapterKategori.AdapterKategoriViewHolder> {

    List<ItemModel> list;
    List<ItemModel> listFull;

    public class AdapterKategoriViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambar;
        private TextView judul, deskripsi;

        public AdapterKategoriViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.idImg);
            judul = itemView.findViewById(R.id.idJudul);
            deskripsi = itemView.findViewById(R.id.idDesk);

        }

        public void bind(final ItemModel itemModel, final AdapterKategori.OnItemClickListener listener) {
            gambar.setImageResource(itemModel.getIdListGambar());
            judul.setText(itemModel.getIdListNama());
            deskripsi.setText(itemModel.getIdListDeskripsi());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onItemClicked(itemModel);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        public void onItemClicked(ItemModel itemModel);
    }

    private AdapterKategori.OnItemClickListener listener;

    public AdapterKategori() {
        list = new ArrayList<>();
        listFull = new ArrayList<>();
    }

    @Override
    public AdapterKategoriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        AdapterKategori.AdapterKategoriViewHolder holder = new AdapterKategori.AdapterKategoriViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKategori.AdapterKategoriViewHolder holder, int position) {
        ItemModel item = list.get(position);
        holder.bind(item, listener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public AdapterKategori(@NonNull List<ItemModel> list) {
        this.list = list;
        listFull = new ArrayList<>(list);
    }

    public AdapterKategori(@NonNull AdapterKategori.OnItemClickListener listener) {
        list = new ArrayList<>();
        listFull = new ArrayList<>(list);
        this.listener = listener;
    }

    public AdapterKategori(List<ItemModel> list, AdapterKategori.OnItemClickListener listener) {
        this.list = list;
        listFull = new ArrayList<>(list);
        this.listener = listener;
    }

    public List<ItemModel> getList() {
        return list;
    }

    public List<ItemModel> getListFull() {
        return listFull;
    }

    public void addItem(List<ItemModel> items) {
        list.addAll(items);
        listFull.addAll(items);
    }
}

