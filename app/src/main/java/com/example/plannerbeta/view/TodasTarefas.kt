package com.example.plannerbeta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plannerbeta.R

class TodasTarefas : AppCompatActivity() {
    var recyclerView: RecyclerView?=null
    lateinit var buttonSalvar: Button
    lateinit var arrayNotas: ArrayList<Tarefas>
    var adapter: AdapterTodasAsTarefas? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todastarefas)

        carregarElemento()
        carregarArray()

        AdapterTodasAsTarefas(this, arrayNotas) .let {
            adapter = it
            recyclerView?.adapter = it
        }

        recyclerView?.layoutManager = LinearLayoutManager(this)
    }

    fun carregarElemento(){
        recyclerView = findViewById(R.id.recyclerView)
        buttonSalvar = findViewById(R.id.button_salvar)
    }

    fun carregarArray() {
        arrayNotas = ArrayList()
        arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de activity e .xml", "Em andamento"))
        arrayNotas.add(Tarefas("Desenvolvimento de app", "Criação de recycler View e .xml", "Concluido"))
    }
}