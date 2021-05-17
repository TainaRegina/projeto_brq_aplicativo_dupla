package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        btntarefas = findViewById(R.id.buttontarefas)

    }

    fun carregarTelas() {
        btniniciar.setOnClickListener {
            val iniciar = Intent(this, Nova_tarefa::class.java)
            startActivity(iniciar)

        }

        btntarefas.setOnClickListener {
            val tarefas = Intent(this, TodasTarefas::class.java)
            startActivity(tarefas)
        }

    }
}











