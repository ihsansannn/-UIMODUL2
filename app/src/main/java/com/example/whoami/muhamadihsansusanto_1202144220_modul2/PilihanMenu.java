package com.example.whoami.muhamadihsansusanto_1202144220_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PilihanMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihmenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    private void initdata() {
        listmenu.add(new pilihmenu(R.drawable.burger, "Burger", 25000, "Roti, Daging, Acar, Keju"));
        listmenu.add(new pilihmenu(R.drawable.nasigoreng, "NasiGoreng", 40000, "Nasi Goreng dengan bumbu rahasia yang menggugah selera"));
        listmenu.add(new pilihmenu(R.drawable.pizza, "Pepperoni Pizza", 60000, "Pepperoni, keju, sayuran, daging, dough"));
        listmenu.add(new pilihmenu(R.drawable.friedchicken, "Fried Chicken", 35000, "Fried Chicken dengan saus blognise"));
        listmenu.add(new pilihmenu(R.drawable.miegoreng, "Mie Goreng", 50000, "Mie Goreng dengan bumbu pedas yang enak"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
