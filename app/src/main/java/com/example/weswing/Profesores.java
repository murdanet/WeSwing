package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Profesores extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyData> dataList;

    ImageView calendario;

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);

        // Obtener la referencia al RecyclerView desde el layout
        recyclerView = findViewById(R.id.recyclerProfessors);

        // Configurar el administrador de diseño (LayoutManager)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        calendario=findViewById(R.drawable.baseline_calendar_today_24);

        // Crear la lista de datos
        dataList = new ArrayList<>();
        // Agregar los objetos de datos a la lista
        dataList.add(new MyData(R.drawable.usuario, "Abel Susin", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Norma Miller", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Al Minns", "Professor"));
        dataList.add(new MyData(R.drawable.usuario, "George Snowden", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Jean Veloz", "Professor"));


        // Crear el adaptador personalizado y pasar la lista de datos
        adapter = new MyAdapter(dataList);

        // Establecer el adaptador en el RecyclerView
        recyclerView.setAdapter(adapter);

    }
}