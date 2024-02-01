package com.example.KyotoApp.model;

public class ItemModel {

    private int idListGambar, idListDeskripsi, idListlok, idListaks, idListwak, idListfee, idListdae, idListlink, idListkor;
    private String idListNama;

    public ItemModel(int idListGambar, String idListNama, int idListDeskripsi, int idListlok, int idListaks, int idListwak, int idListfee, int idListdae, int idListlink, int idListkor) {
        this.idListGambar = idListGambar;
        this.idListNama = idListNama;
        this.idListDeskripsi = idListDeskripsi;
        this.idListlok = idListlok;
        this.idListaks = idListaks;
        this.idListwak = idListwak;
        this.idListfee = idListfee;
        this.idListdae = idListdae;
        this.idListlink = idListlink;
        this.idListkor = idListkor;
    }

    public int getIdListGambar() {
        return idListGambar;
    }

    public void setIdListGambar(int idListGambar) {
        this.idListGambar = idListGambar;
    }

    public String getIdListNama() {
        return idListNama;
    }

    public void setIdListNama(String idListNama) {
        this.idListNama = idListNama;
    }

    public int getIdListDeskripsi() {
        return idListDeskripsi;
    }

    public void setIdListDeskripsi(int idListDeskripsi) {
        this.idListDeskripsi = idListDeskripsi;
    }

    public int getIdListlok() { return idListlok; }

    public void setIdListlok(int idListlok) { this.idListlok = idListlok; }

    public int getIdListaks() {
        return idListaks;
    }

    public void setIdListaks(int idListaks) {
        this.idListaks = idListaks;
    }

    public int getIdListwak() {
        return idListwak;
    }

    public void setIdListwak(int idListwak) {
        this.idListwak = idListwak;
    }

    public int getIdListfee() {
        return idListfee;
    }

    public void setIdListfee(int idListfee) {
        this.idListfee = idListfee;
    }

    public int getIdListdae() {
        return idListdae;
    }

    public void setIdListdae(int idListdae) {
        this.idListdae = idListdae;
    }

    public int getIdListlink() {
        return idListlink;
    }

    public void setIdListlink(int idListlink) {
        this.idListlink = idListlink;
    }

    public int getIdListkor() { return idListkor; }

    public void setIdListkor(int idListkor0) { this.idListkor = idListkor; }

}
