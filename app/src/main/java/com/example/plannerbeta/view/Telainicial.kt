package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.core.content.ContextCompat.startActivity
import com.example.plannerbeta.R

lateinit var btniniciar: Button
lateinit var btnandamento: Button
lateinit var btnconcluido: Button
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
        btniniciar = findViewById(R.id.buttoniniciar)
        btnandamento = findViewById(R.id.buttonandamento)
        btnconcluido = findViewById(R.id.buttonconcluido)
        btnimportante = findViewById(R.id.buttonimportante)
        btntarefas = findViewById(R.id.buttontarefas)

    }

    fun carregarTelas() {
        btniniciar.setOnClickListener {
            val iniciar = Intent(this, Iniciar::class.java)
            startActivity(iniciar)

        }
        btnandamento.setOnClickListener {
            val andamento = Intent(this, Andamento::class.java)
            startActivity(andamento)
        }

        btnconcluido.setOnClickListener {
            val concluido = Intent(this, Concluido::class.java)
            startActivity(concluido)
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











