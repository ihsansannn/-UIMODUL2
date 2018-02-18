package com.example.whoami.muhamadihsansusanto_1202144220_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void liatmenuu(View view) {
        startActivity(new Intent(TakeAway.this, PilihanMenu.class));
        finish();
    }
}
