package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.plannerbeta.R

lateinit var btntarefas: Button


class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    fun carregarElementos() {

        btntarefas = findViewById(R.id.buttontarefas)

    }

    fun carregarTelas() {

        btntarefas.setOnClickListener {
            val tarefas = Intent(this, TodasTarefas::class.java)
            startActivity(tarefas)
        }

    }
}











