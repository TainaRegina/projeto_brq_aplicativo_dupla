package com.example.plannerbeta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class TodasAsTarefas : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    lateinit var buttonSalvar: Button
    lateinit var buttonAdicionar: Button
    lateinit var buttonDeletar: Button
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)

        carregarElemento()
        carregarArray()
        carregarEvento()

        buttonAdicionar = findViewById(R.id.button_add)

        AdapterTodasAsTarefas(this, arrayNotas).let {
            adapter = it
            recyclerView?.adapter = it
        }

        recyclerView?.layoutManager = LinearLayoutManager(this)
    }

    private fun AdapterTodasAsTarefas(context: TodasAsTarefas, arrayDeTarefas: java.util.ArrayList<Tarefas>): AdapterTodasAsTarefas {
        TODO("Not yet implemented")
    }

    fun carregarElemento() {
        recyclerView = findViewById(R.id.recyclerView)
        buttonSalvar = findViewById(R.id.button_salvar)
        buttonAdicionar = findViewById(R.id.button_add)
    }

    fun carregarArray() {
        arrayNotas = ArrayList()
        arrayNotas.add(
            Tarefas(
                "Desenvolvimento de app",
                "Criação de activity e .xml",
                "Em andamento"
            )
        )
        arrayNotas.add(
            Tarefas(
                "Desenvolvimento de app",
                "Criação de recycler View e .xml",
                "Concluido"
            )
        )
    }

    fun carregarEvento() {

        buttonAdicionar.setOnClickListener {
            val todasAsTarefas = Intent(applicationContext, TodasAsTarefas::class.java)
        }

        buttonSalvar.setOnClickListener {
            val todasAsTarefas = Intent(this, TodasAsTarefas::class.java)
            startActivity(todasAsTarefas)
        }
    }
}