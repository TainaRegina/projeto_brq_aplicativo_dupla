package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.plannerbeta.R

<<<<<<< HEAD
lateinit var btn_novatarefa: Button

=======
lateinit var btniniciar: Button
lateinit var btnimportante: Button
lateinit var btntarefas: Button
>>>>>>> 6c14da8ede3ddb9e39c3f7a47096342923c4c50f


class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        carregarElementos()
        carregarTelas()
    }

    fun carregarElementos() {
<<<<<<< HEAD
         btn_novatarefa = findViewById(R.id.button_novatarefa)
=======
        btnimportante = findViewById(R.id.buttonimportante)
        btntarefas = findViewById(R.id.buttontarefas)
        btniniciar = findViewById(R.id.buttoniniciar)
>>>>>>> 6c14da8ede3ddb9e39c3f7a47096342923c4c50f

    }

    fun carregarTelas() {
<<<<<<< HEAD
        btn_novatarefa.setOnClickListener {
            val novaTarefa = Intent(this, Nova_tarefa::class.java)
            startActivity(novaTarefa)

        }

=======

        btntarefas.setOnClickListener {
            val tarefas = Intent(this, TodasTarefas::class.java)
            startActivity(tarefas)
        }
>>>>>>> 6c14da8ede3ddb9e39c3f7a47096342923c4c50f

    }
}











