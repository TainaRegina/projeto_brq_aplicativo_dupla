package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class TodasTarefas : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)

        carregarElementos()
            }
    fun carregarElementos(){
        recyclerView = findViewById(R.id.rvtarefas)
    }
}