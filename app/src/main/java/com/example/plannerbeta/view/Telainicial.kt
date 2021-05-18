package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.plannerbeta.R

lateinit var btn_novatarefa: Button



class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    fun carregarElementos() {
         btn_novatarefa = findViewById(R.id.button_novatarefa)

    }

    fun carregarTelas() {
        btn_novatarefa.setOnClickListener {
            val novaTarefa = Intent(this, Nova_tarefa::class.java)
            startActivity(novaTarefa)

        }


    }
}











