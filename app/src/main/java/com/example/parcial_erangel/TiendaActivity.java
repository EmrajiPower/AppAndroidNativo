package com.example.parcial_erangel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class TiendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        RecyclerView recyclerView;

        ArrayList<MainModel> mainModels;
        MainAdapter mainAdapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tienda);

        recyclerView = findViewById(R.id.recycler_view);

        Integer[] juguetesLogo = {R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5};

        String[] juguetesNombre = {"Casa $100.000","Carro $50.0000","Papa $35.000","Peluches $70.000","Dinosaurio $80.000"};

        mainModels = new ArrayList<>();
        for( int i = 0; i < juguetesLogo.length ; i++){
            MainModel model = new MainModel(juguetesLogo[i],juguetesNombre[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                TiendaActivity.this,LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(TiendaActivity.this,mainModels);
        recyclerView.setAdapter(mainAdapter);
    }

    public void onClick(View view) {
        Intent i = new Intent(this,TarjetaActivity.class);
        startActivity(i);
    }
}
