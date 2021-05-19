package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import com.example.plannerbeta.R

lateinit var btntarefas: Button



class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    private fun carregarElementos() {
        btntarefas = findViewById(R.id.button_tarefas)

    }

    fun carregarTelas() {

        btntarefas.setOnClickListener {
            val tarefas = Intent(this, TodasAsTarefas::class.java)
            startActivity(tarefas)

        }

    }
}










