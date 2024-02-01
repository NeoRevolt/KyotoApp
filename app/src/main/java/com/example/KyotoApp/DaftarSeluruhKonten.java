package com.example.KyotoApp;

import com.example.KyotoApp.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DaftarSeluruhKonten {
    public DaftarSeluruhKonten() {
    }


    //TODO
    public List<ItemModel> listData() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.addAll(listDataWisata());
        listModel.addAll(listDataKuil());
        listModel.addAll(listDataMakanan());
        listModel.addAll(listDataFestival());
        return listModel;
    }

    public List<ItemModel> listDataWisata() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.kbamboogrove, "Bamboo Grove", R.string.des_bamboogrove, R.string.lok_bamboogrove, R.string.aks_bamboogrove, R.string.wak_bamboogrove, R.string.fee_bamboogrove,R.string.dae_bamboogrove, R.string.link_bamboogrove, R.string.kor_bamboogrove));
        listModel.add(new ItemModel(R.drawable.kkyotoaquarium, "Kyoto Aquarium", R.string.des_kyotoaquarium, R.string.lok_kyotoaquarium, R.string.aks_kyotoaquarium, R.string.wak_kyotoaquarium, R.string.fee_kyotoaquarium, R.string.dae_kyotoaquarium, R.string.link_kyotoaquarium, R.string.kor_kyotoaquarium));
        listModel.add(new ItemModel(R.drawable.kkyotobotanicalgarden, "Kyoto Botanical Garden", R.string.des_kyotobotanicalgarden, R.string.lok_kyotobotanicalgarden, R.string.aks_kyotobotanicalgarden, R.string.wak_kyotobotanicalgarden, R.string.fee_kyotobotanicalgarden, R.string.dae_kyotobotanicalgarden, R.string.link_kyotobotanicalgarden, R.string.kor_kyotobotanicalgarden));
        listModel.add(new ItemModel(R.drawable.kkyotoimperialpalace, "Kyoto Imperial Palace", R.string.des_kyotoimperialpalace, R.string.lok_kyotoimperialpalace, R.string.aks_kyotoimperialpalace, R.string.wak_kyotoimperialpalace, R.string.fee_kyotoimperialpalace, R.string.dae_kyotoimperialpalace, R.string.link_kyotoimperialpalace, R.string.kor_kyotoimperialpalace));
        listModel.add(new ItemModel(R.drawable.kkyotointernationalmangamuseum, "Kyoto International Manga Museum", R.string.des_kyotointernationalmangamuseum, R.string.lok_kyotointernationalmangamuseum, R.string.aks_kyotointernationalmangamuseum, R.string.wak_kyotointernationalmangamuseum, R.string.fee_kyotointernationalmangamuseum, R.string.dae_kyotointernationalmangamuseum, R.string.link_kyotointernationalmangamuseum, R.string.kor_kyotointernationalmangamuseum));
        listModel.add(new ItemModel(R.drawable.kkyotonationalmuseum, "Kyoto National Museum", R.string.des_kyotonationalmuseum, R.string.lok_kyotonationalmuseum, R.string.aks_kyotonationalmuseum, R.string.wak_kyotonationalmuseum, R.string.fee_kyotonationalmuseum, R.string.dae_kyotonationalmuseum, R.string.link_kyotonationalmuseum, R.string.kor_kyotonationalmuseum));
        listModel.add(new ItemModel(R.drawable.kkyototower, "Kyoto Tower", R.string.des_kyototower, R.string.lok_kyototower, R.string.aks_kyototower, R.string.wak_kyototower, R.string.fee_kyototower, R.string.dae_kyototower, R.string.link_kyototower, R.string.kor_kyototower));
        listModel.add(new ItemModel(R.drawable.kmonkeyparkiwatayama, "Monkey Park Iwatayama", R.string.des_monkeyparkiwatayama, R.string.lok_monkeyparkiwatayama, R.string.aks_monkeyparkiwatayama, R.string.wak_monkeyparkiwatayama, R.string.fee_monkeyparkiwatayama, R.string.dae_monkeyparkiwatayama, R.string.link_monkeyparkiwatayama, R.string.kor_monkeyparkiwatayama));
        listModel.add(new ItemModel(R.drawable.kryoanjizengarden, "Ryoan-Ji Zen-Garden", R.string.des_ryoanjizengarden, R.string.lok_ryoanjizengarden, R.string.aks_ryoanjizengarden, R.string.wak_ryoanjizengarden, R.string.fee_ryoanjizengarden, R.string.dae_ryoanjizengarden, R.string.link_ryoanjizengarden, R.string.kor_ryoanjizengarden));
        return listModel;
    }

    public List<ItemModel> listDataKuil() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.kfushimiinarishrine, "Fushimi Inari Shrine (Taisha)", R.string.des_fushimiinarishrine_taisha, R.string.lok_fushimiinarishrine_taisha, R.string.aks_fushimiinarishrine_taisha, R.string.wak_fushimiinarishrine_taisha, R.string.fee_fushimiinarishrine_taisha, R.string.dae_fushimiinarishrine_taisha, R.string.link_fushimiinarishrine_taisha, R.string.kor_fushimiinarishrine_taisha));
        listModel.add(new ItemModel(R.drawable.kginkakuji, "Ginkaku Ji (Tera)", R.string.des_ginkakuji_tera, R.string.lok_ginkakuji_tera, R.string.aks_ginkakuji_tera, R.string.wak_ginkakuji_tera, R.string.fee_ginkakuji_tera, R.string.dae_ginkakuji_tera, R.string.link_ginkakuji_tera, R.string.kor_ginkakuji_tera));
        listModel.add(new ItemModel(R.drawable.kheianshrine, "Heian Shrine (Jingu)", R.string.des_heianshrine_jingu, R.string.lok_heianshrine_jingu, R.string.aks_heianshrine_jingu, R.string.wak_heianshrine_jingu, R.string.fee_heianshrine_jingu, R.string.dae_heianshrine_jingu, R.string.link_heianshrine_jingu, R.string.kor_heianshrine_jingu));
        listModel.add(new ItemModel(R.drawable.kkamigamoshrine, "Kamigamo Shrine (Jinja)", R.string.des_kamigamoshrine_jinja, R.string.lok_kamigamoshrine_jinja, R.string.aks_kamigamoshrine_jinja, R.string.wak_kamigamoshrine_jinja, R.string.fee_kamigamoshrine_jinja, R.string.dae_kamigamoshrine_jinja, R.string.link_kamigamoshrine_jinja, R.string.kor_kamigamoshrine_jinja));
        listModel.add(new ItemModel(R.drawable.kkifuneshrine, "Kifune Shrine (Jinja)", R.string.des_kifuneshrine_jinja, R.string.lok_kifuneshrine_jinja, R.string.aks_kifuneshrine_jinja, R.string.wak_kifuneshrine_jinja, R.string.fee_kifuneshrine_jinja, R.string.dae_kifuneshrine_jinja, R.string.link_kifuneshrine_jinja, R.string.kor_kifuneshrine_jinja));
        listModel.add(new ItemModel(R.drawable.kkinkakuji, "Kinkaku Ji (Tera)", R.string.des_kinkakuji_tera, R.string.lok_kinkakuji_tera, R.string.aks_kinkakuji_tera, R.string.wak_kinkakuji_tera, R.string.fee_kinkakuji_tera, R.string.dae_kinkakuji_tera, R.string.link_kinkakuji_tera, R.string.kor_kinkakuji_tera));
        listModel.add(new ItemModel(R.drawable.kkiyomizudera, "Kiyomizu-Dera (Tera)", R.string.des_kiyomizu_dera_tera, R.string.lok_kiyomizu_dera_tera, R.string.aks_kiyomizu_dera_tera, R.string.wak_kiyomizu_dera_tera, R.string.fee_kiyomizu_dera_tera, R.string.dae_kiyomizu_dera_tera, R.string.link_kiyomizu_dera_tera, R.string.kor_kiyomizu_dera_tera));
        listModel.add(new ItemModel(R.drawable.kkuramadera, "Kurama-Dera (Tera)", R.string.des_kurama_dera_tera, R.string.lok_kurama_dera_tera, R.string.aks_kurama_dera_tera, R.string.wak_kurama_dera_tera, R.string.fee_kurama_dera_tera, R.string.dae_kurama_dera_tera, R.string.link_kurama_dera_tera, R.string.kor_kurama_dera_tera));
        listModel.add(new ItemModel(R.drawable.knanzenji, "Nanzen Ji (Tera)", R.string.des_nanzenji_tera, R.string.lok_nanzenji_tera, R.string.aks_nanzenji_tera, R.string.wak_nanzenji_tera, R.string.fee_nanzenji_tera, R.string.dae_nanzenji_tera, R.string.link_nanzenji_tera, R.string.kor_nanzenji_tera));
        listModel.add(new ItemModel(R.drawable.krengeoinsanjusangendo, "Rengeoin Sanjusangendo (Tera)", R.string.des_rengeoin_sanjusangendo_tera, R.string.lok_rengeoin_sanjusangendo_tera, R.string.aks_rengeoin_sanjusangendo_tera, R.string.wak_rengeoin_sanjusangendo_tera, R.string.fee_rengeoin_sanjusangendo_tera, R.string.dae_rengeoin_sanjusangendo_tera, R.string.link_rengeoin_sanjusangendo_tera, R.string.kor_rengeoin_sanjusangendo_tera));
        listModel.add(new ItemModel(R.drawable.kshimogamoshrine, "Shimogamo Shrine (Jinja)", R.string.des_shimogamoshrine_jinja, R.string.lok_shimogamoshrine_jinja, R.string.aks_shimogamoshrine_jinja, R.string.wak_shimogamoshrine_jinja, R.string.fee_shimogamoshrine_jinja, R.string.dae_shimogamoshrine_jinja, R.string.link_shimogamoshrine_jinja, R.string.kor_shimogamoshrine_jinja));
        listModel.add(new ItemModel(R.drawable.ktenryuji, "Tenryu Ji (Tera)", R.string.des_tenryuji_tera, R.string.lok_tenryuji_tera, R.string.aks_tenryuji_tera, R.string.wak_tenryuji_tera, R.string.fee_tenryuji_tera, R.string.dae_tenryuji_tera, R.string.link_tenryuji_tera, R.string.kor_tenryuji_tera));
        listModel.add(new ItemModel(R.drawable.ktoji, "To Ji (Tera)", R.string.des_toji_tera, R.string.lok_toji_tera, R.string.aks_toji_tera, R.string.wak_toji_tera, R.string.fee_toji_tera, R.string.dae_toji_tera, R.string.link_toji_tera, R.string.kor_toji_tera));
        listModel.add(new ItemModel(R.drawable.kyasakashrine, "Yasaka Shrine (Jinja)", R.string.des_yasaka_shrine_jinja, R.string.lok_yasaka_shrine_jinja, R.string.aks_yasaka_shrine_jinja, R.string.wak_yasaka_shrine_jinja, R.string.fee_yasaka_shrine_jinja, R.string.dae_yasaka_shrine_jinja, R.string.link_yasaka_shrine_jinja, R.string.kor_toji_tera));
        return listModel;
    }

    public List<ItemModel> listDataMakanan() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.kchirimensansho, "Chirimen Sansho", R.string.des_chirimensansho, R.string.lok_chirimensansho, R.string.aks_chirimensansho, R.string.wak_chirimensansho, R.string.fee_chirimensansho, R.string.dae_chirimensansho, R.string.link_chirimensansho, R.string.kor_chirimensansho));
        listModel.add(new ItemModel(R.drawable.khamonootoshi, "Hamo no Otoshi", R.string.des_hamonootoshi, R.string.lok_hamonootoshi, R.string.aks_hamonootoshi, R.string.wak_hamonootoshi, R.string.fee_hamonootoshi, R.string.dae_hamonootoshi, R.string.link_hamonootoshi, R.string.kor_hamonootoshi));
        listModel.add(new ItemModel(R.drawable.kkamonasudengaku, "Kamonasu Dengaku", R.string.des_kamonasudengaku, R.string.lok_kamonasudengaku, R.string.aks_kamonasudengaku, R.string.wak_kamonasudengaku, R.string.fee_kamonasudengaku, R.string.dae_kamonasudengaku, R.string.link_kamonasudengaku, R.string.kor_kamonasudengaku));
        listModel.add(new ItemModel(R.drawable.kkyotsukemono, "Kyo Tsukemono", R.string.des_kyotsukemono, R.string.lok_kyotsukemono, R.string.aks_kyotsukemono, R.string.wak_kyotsukemono, R.string.fee_kyotsukemono, R.string.dae_kyotsukemono, R.string.link_kyotsukemono, R.string.kor_kyotsukemono));
        listModel.add(new ItemModel(R.drawable.kyatsuhashi, "Yatsuhashi", R.string.des_yatsuhashi, R.string.lok_yatsuhashi, R.string.aks_yatsuhashi, R.string.wak_yatsuhashi, R.string.fee_yatsuhashi, R.string.dae_yatsuhashi, R.string.link_yatsuhashi, R.string.kor_yatsuhashi));
        listModel.add(new ItemModel(R.drawable.kyudofu, "Yudofu", R.string.des_yudofu, R.string.lok_yudofu, R.string.aks_yudofu, R.string.wak_yudofu, R.string.fee_yudofu, R.string.dae_yudofu, R.string.link_yudofu, R.string.kor_yudofu));
        listModel.add(new ItemModel(R.drawable.kkaiseki, "Kaiseki", R.string.des_kaiseki, R.string.lok_kaiseki, R.string.aks_kaiseki, R.string.wak_kaiseki, R.string.fee_kaiseki, R.string.dae_kaiseki, R.string.link_kaiseki, R.string.kor_kaiseki));
        return listModel;
    }

    public List<ItemModel> listDataFestival() {
        List<ItemModel> listModel = new ArrayList<>();
        listModel.add(new ItemModel(R.drawable.kaoimatsuri, "Aoi Matsuri", R.string.des_aoimatsuri, R.string.lok_aoimatsuri, R.string.aks_aoimatsuri, R.string.wak_aoimatsuri, R.string.fee_aoimatsuri, R.string.dae_aoimatsuri, R.string.link_aoimatsuri, R.string.kor_aoimatsuri));
        listModel.add(new ItemModel(R.drawable.kgionmatsuri, "Gion Matsuri", R.string.des_gionmatsuri, R.string.lok_gionmatsuri, R.string.aks_gionmatsuri, R.string.wak_gionmatsuri, R.string.fee_gionmatsuri, R.string.dae_gionmatsuri, R.string.link_gionmatsuri, R.string.kor_gionmatsuri));
        listModel.add(new ItemModel(R.drawable.kjidaimatsuri, "Jidai Matsuri", R.string.des_jidaimatsuri, R.string.lok_jidaimatsuri, R.string.aks_jidaimatsuri, R.string.wak_jidaimatsuri, R.string.fee_jidaimatsuri, R.string.dae_jidaimatsuri, R.string.link_jidaimatsuri, R.string.kor_jidaimatsuri));
        return listModel;
    }
}