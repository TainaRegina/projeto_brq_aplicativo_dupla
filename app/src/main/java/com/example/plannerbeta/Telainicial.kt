package com.example.plannerbeta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.plannerbeta.Week.StatusEmAndamento
import com.example.plannerbeta.Week.StatusConcluido
import com.example.plannerbeta.Week.StatusIniciar

    lateinit var btnSegunda: ImageButton
    lateinit var btnTerca: ImageButton
    lateinit var btnQuarta: ImageButton
    lateinit var btnQuinta: ImageButton


class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    fun carregarElementos() {
        btnSegunda = findViewById(R.id.imageButton_segunda)
        btnTerca = findViewById(R.id.imageButton_terca)
        btnQuarta = findViewById(R.id.imageButton_quarta)
        btnQuinta = findViewById(R.id.imageButton_quinta)

    }
    fun carregarTelas(){
        btnSegunda.setOnClickListener {
            val segunda = Intent(this, StatusConcluido::class.java)
            startActivity(segunda)
        }
        btnTerca.setOnClickListener {
            val terca = Intent(this, StatusIniciar::class.java)
            startActivity(terca)
        }
        btnQuarta.setOnClickListener {
            val quarta = Intent(this, StatusEmAndamento::class.java)
            startActivity(quarta)
        }
        btnQuinta.setOnClickListener {
            val quinta = Intent(this, StatusIniciar::class.java)
            startActivity(quinta)
        }
    }
}




