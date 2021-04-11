package com.example.recyclenanda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_epl;
    private ArrayList<Klub> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv_epl = findViewById(R.id.rv_epl);
        rv_epl.setHasFixedSize(true);

        list.addAll(DataKlub.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rv_epl.setLayoutManager(new LinearLayoutManager(this));
        KlubAdapter klubAdapter = new KlubAdapter(list);
        rv_epl.setAdapter(klubAdapter);
    }
}