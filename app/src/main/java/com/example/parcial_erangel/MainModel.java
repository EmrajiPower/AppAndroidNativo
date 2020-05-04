package com.example.parcial_erangel;

public class MainModel {
    Integer juguetesLogo;
    String juguetesNombre;

    public MainModel(Integer juguetesLogo, String juguetesNombre){
        this.juguetesLogo = juguetesLogo;
        this.juguetesNombre = juguetesNombre;
    }

    public Integer getJuguetesLogo(){
        return juguetesLogo;
    }

    public String getJuguetesNombre(){
        return juguetesNombre;
    }

}
