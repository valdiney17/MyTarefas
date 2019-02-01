package com.example.pcmaster.mytarefas;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pcmaster.mytarefas.modelos.Tarefa;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class Tarefas extends AppCompatActivity {

    RecyclerView rvTarefas;
    private Box<Tarefa> boxTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefas);


    }
}
