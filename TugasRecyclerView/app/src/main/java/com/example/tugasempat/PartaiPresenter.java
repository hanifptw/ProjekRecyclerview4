package com.example.tugasempat;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class PartaiPresenter {
    Context context;
    List<PartaiModel> partaiModels = new ArrayList<>();
    MainView view;
    public PartaiPresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        PartaiModel film;

        film = new PartaiModel("Partai Solidaritas Indonesia", R.drawable.psi, "Partai yang diketuai oleh Grace Natali");
        partaiModels.add(film);
        film = new PartaiModel("Partai PDI Perjuangan", R.drawable.pdi, "Partai yang berlogo banteng hitam");
        partaiModels.add(film);
        film = new PartaiModel("Partai Nasdem", R.drawable.nasdem, "Partai panas adem");
        partaiModels.add(film);
        film = new PartaiModel("Partai Perindo", R.drawable.perindo, "Partai yang viral dengan marsnya");
        partaiModels.add(film);
        film = new PartaiModel("Partai Golongan Karya", R.drawable.golkar, "Partai yang dominan warna kuning");
        partaiModels.add(film);
        film = new PartaiModel("Partai Kebangkitan Bangsa", R.drawable.pkb, "Partai yang berdominan warna hijau");
        partaiModels.add(film);

        view.onSuccess(partaiModels);

    }
}
