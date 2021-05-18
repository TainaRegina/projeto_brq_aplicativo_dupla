package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.core.content.ContextCompat.startActivity
import com.example.plannerbeta.R

lateinit var btniniciar: Button
lateinit var btnimportante: Button
lateinit var btntarefas: Button


class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    fun carregarElementos() {
        btnimportante = findViewById(R.id.buttonimportante)
        btntarefas = findViewById(R.id.buttontarefas)

    }

    fun carregarTelas() {
        btniniciar.setOnClickListener {
            val iniciar = Intent(this, Iniciar::class.java)
            startActivity(iniciar)

        }

        btnimportante.setOnClickListener {
            val importante = Intent(this, Importante::class.java)
            startActivity(importante)
        }

        btntarefas.setOnClickListener {
            val tarefas = Intent(this, TodasTarefas::class.java)
            startActivity(tarefas)
        }

    }
}











