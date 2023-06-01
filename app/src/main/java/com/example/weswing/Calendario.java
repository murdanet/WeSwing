package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Calendario extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter3 adapter;
    private List<MyData3> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        TextView botonFiltros = findViewById(R.id.filtres);
        botonFiltros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calendario.this, Filtros.class);
                startActivity(intent);
            }
        });

        // Obtener la referencia al RecyclerView desde el layout
        recyclerView = findViewById(R.id.recyclerMogudes);

        // Configurar el administrador de diseño (LayoutManager)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Crear la lista de datos
        dataList = new ArrayList<>();
        // Agregar los objetos de datos a la lista
        dataList.add(new MyData3(R.drawable.usuario, "17 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","17/04/2017-17/04/2017 | 2horas","Madrid, Spain"));
        dataList.add(new MyData3(R.drawable.usuario, "18 de abril de 2017", "Big Martes","Organitzat per Big Mama","18/04/2017-18/04/2017 | 2horas","Madrid, Spain"));
        dataList.add(new MyData3(R.drawable.usuario, "19 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","19/04/2017-19/04/2017 | 2horas","Madrid, Spain"));

        // Crear el adaptador personalizado y pasar la lista de datos
        adapter = new MyAdapter3(dataList);

        // Establecer el adaptador en el RecyclerView
        recyclerView.setAdapter(adapter);
    }
}