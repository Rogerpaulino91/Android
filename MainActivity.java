package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout cadastrar;
    RelativeLayout listar;
    RelativeLayout deletar;
    RelativeLayout consultar;
    LayoutInflater layoutInflate;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cadastrar = findViewById(R.layout.cadastrar);
        listar = findViewById(R.layout.listar);
        deletar = findViewById(R.layout.deletar);
        consultar = findViewById(R.layout.consultar);
        layoutInflate = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();
        if(menuId == R.id.acao_consultar) {
            Context context = MainActivity.this;
            Toast.makeText(context, "procurando...", Toast.LENGTH_SHORT).show();
            addViewConsultar(context);
        }
        return super.onOptionsItemSelected(item);
    }

    public void addViewConsultar(Context view) {

    }
}
