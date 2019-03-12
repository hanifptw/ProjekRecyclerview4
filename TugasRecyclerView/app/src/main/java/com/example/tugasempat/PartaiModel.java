package com.example.tugasempat;

import android.graphics.drawable.Drawable;

public class PartaiModel {
    String namanya;
    int gambarnya;
    String overview;

    public PartaiModel(String namanya, int gambarnya, String overview){
        this.namanya = namanya;
        this.gambarnya = gambarnya;
        this.overview = overview;
    }

    public String getNamanya() {
        return namanya;
    }

    public int getGambarnya() {
        return gambarnya;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
